fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val map1 = mutableMapOf<Char, Int>()
    val map2 = mutableMapOf<Char, Int>()
    s.forEachIndexed { index, i ->
        map1[s[index]] = (map1[s[index]] ?: 0) + 1
        map2[t[index]] = (map2[t[index]] ?: 0) + 1
    }

    s.forEach {
        if (map1[it] != map2[it])
            return false
    }
    return true
}

fun main() {
    println(
        isAnagram("rat", "car")
    )
}
