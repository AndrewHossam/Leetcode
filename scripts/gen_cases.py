#!/usr/bin/env python3
"""Emit JUnit test methods for a LeetCode problem's example cases.
Called by scripts/lc. Prints Kotlin @Test blocks to stdout; prints nothing
(fallback) on any uncertainty so the scaffolder uses a generic TODO instead.

Usage: gen_cases.py <slug>
"""
import sys, json, re, urllib.request, html

URL = "https://leetcode.com/graphql"


def fetch(slug):
    body = json.dumps({
        "query": "query{question(titleSlug:\"%s\"){exampleTestcases content codeSnippets{lang code}}}" % slug
    }).encode()
    req = urllib.request.Request(
        URL, data=body,
        headers={"content-type": "application/json",
                 "user-agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) lc-scaffolder"},
    )
    with urllib.request.urlopen(req, timeout=20) as r:
        return json.load(r)["data"]["question"]


def split_top(s, sep):
    depth = 0
    out, cur = [], ""
    for ch in s:
        if ch == "<":
            depth += 1
        elif ch == ">":
            depth -= 1
        if ch == sep and depth == 0:
            out.append(cur)
            cur = ""
        else:
            cur += ch
    out.append(cur)
    return out


def parse_sig(code):
    """Return (method_name, [param_types], return_type) or None."""
    if len(re.findall(r"\bfun\s+\w+", code)) != 1:
        return None  # multi-method problem (e.g. stack/design) — can't auto-gen
    m = re.search(r"fun\s+(\w+)\s*\(([^)]*)\)\s*:\s*([A-Za-z0-9_<>,\[\]?]+)\s*\{", code)
    if not m:
        return None
    name, params_raw, ret = m.group(1), m.group(2).strip(), m.group(3).strip()
    types = []
    for p in split_top(params_raw, ","):
        p = p.strip()
        if not p:
            continue
        if ":" not in p:
            return None
        types.append(p.split(":", 1)[1].strip())
    return name, types, ret


def conv(typ, val):
    """Convert a LeetCode literal string to a Kotlin literal by type, or None."""
    typ = typ.replace("?", "").strip()
    val = val.strip()
    if typ in ("Int", "Long", "Boolean"):
        return val
    if typ == "Char":
        return "'" + val.strip("'\"") + "'"
    if typ == "String":
        return val if (val.startswith('"') and val.endswith('"')) else '"' + val + '"'
    if typ == "IntArray":
        inner = val[1:-1].strip() if val.startswith("[") and val.endswith("]") else val
        return "intArrayOf(" + inner + ")"
    if typ == "Array<IntArray>":
        if not (val.startswith("[[") and val.endswith("]]")):
            return None
        rows = re.findall(r"\[[^\]]*\]", val[1:-1])
        return "arrayOf(" + ", ".join("intArrayOf(" + r[1:-1].strip() + ")" for r in rows) + ")"
    return None


def parse_outputs(content, n):
    if not content:
        return []
    text = html.unescape(re.sub(r"<[^>]+>", "", content))
    return [m.strip() for m in re.findall(r"Output:\s*(.+)", text)][:n]


def main():
    slug = sys.argv[1]
    try:
        q = fetch(slug)
    except Exception:
        return  # network/API failure → silent fallback

    sig = parse_sig(next((s["code"] for s in (q.get("codeSnippets") or []) if s["lang"] == "Kotlin"), ""))
    if not sig:
        return
    name, types, ret = sig
    nparams = len(types)
    if nparams == 0:
        return

    raw = (q.get("exampleTestcases") or "").strip()
    lines = [l for l in raw.split("\n") if l.strip() != ""]
    if not lines or len(lines) % nparams != 0:
        return
    cases = [lines[i:i + nparams] for i in range(0, len(lines), nparams)]
    outs = parse_outputs(q.get("content") or "", len(cases))
    # arrays need content equality (assertEquals would compare references)
    ret_clean = ret.replace("?", "").strip()
    assert_fn = "assertContentEquals" if ret_clean in ("IntArray", "Array<IntArray>") else "assertEquals"

    blocks = []
    for i, inputs in enumerate(cases):
        args, ok = [], True
        for typ, raw_in in zip(types, inputs):
            c = conv(typ, raw_in)
            if c is None:
                ok = False
                break
            args.append(c)
        if not ok:
            return  # bail entirely so the file still compiles
        call = f"sut.{name}({', '.join(args)})"
        exp = conv(ret, outs[i]) if i < len(outs) else None
        if exp is None:
            body = (
                "        // Input: " + ", ".join(inputs) + "\n"
                f"        {assert_fn}(\n"
                "            expected = TODO(\"expected output\"),\n"
                f"            actual = {call},\n"
                "        )"
            )
        else:
            body = (
                f"        {assert_fn}(\n"
                f"            expected = {exp},\n"
                f"            actual = {call},\n"
                "        )"
            )
        blocks.append("    @Test\n    fun case%d() {\n%s\n    }" % (i + 1, body))

    print("\n\n".join(blocks))


if __name__ == "__main__":
    main()
