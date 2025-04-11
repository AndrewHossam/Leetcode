package com.andrewhossam

fun canConstruct(
    ransomNote: String,
    magazine: String,
): Boolean {
    val map = mutableMapOf<Char, Int>()
    magazine.forEach {
        map[it] = (map[it] ?: 0) + 1
    }

    ransomNote.forEach {
        if (map[it] == null || map[it]!! < 1) {
            return false
        } else {
            map[it] = map[it]!! - 1
        }
    }
    return true
}

fun main() {
    println(
        canConstruct("aa", "aab"),
    )
}
