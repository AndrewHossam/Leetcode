package com.andrewhossam

import kotlin.math.log10

class `find-numbers-with-even-number-of-digits-1295` {
    fun bruteForce(nums: IntArray): Int = nums.count { it.toString().length % 2 == 0 }

    fun findNumbers(nums: IntArray): Int {
        var numOfEven = 0
        nums.forEach {
            var count = 0
            var current = it
            while (current > 0) {
                current /= 10
                count++
            }
            if (count % 2 == 0) {
                numOfEven++
            }
        }
        return numOfEven
    }

    fun moreOptimized(nums: IntArray): Int =
        nums.count {
            ((log10(it.toDouble()) + 1) % 2).toInt() == 0
        }
}
