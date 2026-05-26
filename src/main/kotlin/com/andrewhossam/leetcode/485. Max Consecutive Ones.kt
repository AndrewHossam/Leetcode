package com.andrewhossam.leetcode

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maxNumber = 0
    var localMax = 0
    for (num in nums) {
        if (num == 0) {
            localMax = 0
        } else {
            localMax++
        }

        if (localMax > maxNumber) {
            maxNumber = localMax
        }
    }
    return maxNumber
}

fun main() {
    println(
        findMaxConsecutiveOnes(
            intArrayOf(
                1,
                1,
                0,
                1,
                1,
                1,
            ),
        ),
    )
}
