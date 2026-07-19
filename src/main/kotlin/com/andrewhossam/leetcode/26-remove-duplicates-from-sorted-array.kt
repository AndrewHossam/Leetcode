package com.andrewhossam.leetcode

// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class `26-remove-duplicates-from-sorted-array` {
    fun main() {
        println(
            removeDuplicates(
                intArrayOf(1, 1, 2),
            ),
        )
    }

    fun removeDuplicates(nums: IntArray): Int {
        var result = 1
        for (i in 1 until nums.size) {
            if (nums[i - 1] != nums[i]) {
                nums[result] = nums[i]
                result++
            }
        }
        return result
    }
}
