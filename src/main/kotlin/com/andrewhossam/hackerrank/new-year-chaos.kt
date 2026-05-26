package com.andrewhossam.hackerrank

import kotlin.math.max

/*
 https://www.hackerrank.com/challenges/new-year-chaos/problem
 * Complete the 'minimumBribes' function below.
 *
 * The function accepts INTEGER_ARRAY q as parameter.
 *
 * [2, 1, 5, 3, 4]
 * [2, 5, 1, 3, 4]
 * [1 2 5 3 7 8 6 4]
 */
fun minimumBribes(q: Array<Int>) {
    var jumps = 0
    for (i in 0 until q.size) {
        if (q[i] - (i + 1) > 2) {
            println("Too chaotic")
            return
        }
        val start = max(0, q[i] - 2)
        for (j in start until i) {
            if (q[j] > q[i]) {
                jumps++
            }
        }
    }
    println(jumps)
}

fun main(args: Array<String>) {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        readln().trim().toInt()

        val q =
            readln()
                .trimEnd()
                .split(" ")
                .map { it.toInt() }
                .toTypedArray()

        minimumBribes(q)
    }
}
