package com.andrewhossam.leetcode

// 153. Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class `153-find-minimum-in-rotated-sorted-array` {
    fun findMin(nums: IntArray): Int {
        val pivot = findPivot(nums) + 1

        return if (pivot == nums.size) {
            nums[0]
        } else {
            nums[pivot]
        }
    }
}
