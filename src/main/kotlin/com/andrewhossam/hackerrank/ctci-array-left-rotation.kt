package com.andrewhossam.hackerrank

import kotlin.math.sign

// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

/*
 * Complete the 'rotLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER d
 */

fun rotLeft(
    a: Array<Int>,
    d: Int,
): Array<Int> = (a.slice(d until a.size) + a.slice(0 until d)).toTypedArray()

fun rotLeft2(
    a: Array<Int>,
    d: Int,
): Array<Int> =
    Array(a.size) { index ->
        a[(index + d) % a.size]
    }

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val a =
        readLine()!!
            .trimEnd()
            .split(" ")
            .map { it.toInt() }
            .toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
