package com.andrewhossam.hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    for (index in 0..<ar.size) {
        map[ar[index]] = map[ar[index]]?.plus(1) ?: 1
    }
    return map.values.sumOf { it / 2 }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
