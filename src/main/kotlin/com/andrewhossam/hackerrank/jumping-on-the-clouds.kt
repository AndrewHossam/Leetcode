package com.andrewhossam.hackerrank

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

fun jumpingOnClouds(c: Array<Int>): Int {
    var jumps = 0
    var currentIndex = 0
    // jump 2 if possible one if not but need to check the game still one
    while (currentIndex < c.size - 1) {
        currentIndex +=
            if (currentIndex + 2 < c.size && c[currentIndex + 2] != 1) {
                // jump 2
                2
            } else {
                1
            }
        jumps++
    }
    return jumps
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val c =
        readLine()!!
            .trimEnd()
            .split(" ")
            .map { it.toInt() }
            .toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
