package com.andrewhossam

fun countSymmetricIntegers(
    low: Int,
    high: Int,
): Int {
    var acc = 0
    for (i in low..high) {
        val s = i.toString()
        if (s.length % 2 == 1) continue

        val s1 = s.substring(0, s.length / 2)
        val s2 = s.substring(s.length / 2, s.length)

        if (s1.sumOf { it.digitToInt() } == s2.sumOf { it.digitToInt() }) {
            acc++
        }
    }
    return acc
}
