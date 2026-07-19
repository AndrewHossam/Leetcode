package com.andrewhossam.leetcode
import kotlin.math.log10

// 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class `1295-find-numbers-with-even-number-of-digits` {
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
