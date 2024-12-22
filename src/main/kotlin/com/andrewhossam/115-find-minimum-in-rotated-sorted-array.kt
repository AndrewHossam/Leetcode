package com.andrewhossam

class `115-find-minimum-in-rotated-sorted-array` {
    fun findMin(nums: IntArray): Int {
        val pivot = findPivot(nums) + 1

        return if (pivot == nums.size) {
            nums[0]
        } else {
            nums[pivot]
        }
    }
}
