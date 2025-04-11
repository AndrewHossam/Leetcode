package com.andrewhossam

fun mergeAlternately(
    word1: String,
    word2: String,
): String {
    var s = ""
    for (i in 0 until Math.max(word1.length, word2.length)) {
        if (i < word1.length - 1) {
            s += word1[i]
        }
        if (i < word2.length - 1) {
            s += word2[i]
        }
    }
    return s
}

fun main() {
    assert(
        mergeAlternately(
            "abc",
            "pqr",
        ) == "apbqcr",
    )
}
