package com.andrewhossam

import kotlin.math.max

fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    // Write your code here
    var max = 0
    for (row in matrix) {
        var firstHalf = 0
        var secondHalf = 0
        row.forEachIndexed { index, i ->
            if (index < row.size / 2) {
                firstHalf += i
            } else {
                secondHalf += i
            }
        }
        max += max(firstHalf, secondHalf)
    }

    return max
}

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var c = 30

    a = a + b + c - a - b

    println(
        "a = $a, b = $b, c = ${c}\n",
    )
}
