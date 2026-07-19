package com.andrewhossam.leetcode

// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/

class `1480-running-sum-of-1d-array` {
    fun runningSum(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var currentValue = 0
        nums.forEachIndexed { i, value ->
            currentValue += value
            result[i] = currentValue
        }
        return result
    }

    fun runningSum2(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        result[0] = nums[0]
        (1 until nums.size).forEach { i ->
            result[i] = nums[i] + result[i - 1]
        }
        return result
    }

    fun main() {
        println(
            runningSum2(intArrayOf(1, 1, 1, 1, 1)).contentToString(),
        )
    }
}
