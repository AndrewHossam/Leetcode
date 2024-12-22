package com.andrewhossam

// 4, 5, 6, 7, 0, 1, 2
class `33-search-in-rotated-sorted-array` {
    fun search(
        nums: IntArray,
        target: Int,
    ): Int {
        val pivot = findPivot(nums)
        var start = 0
        var end = nums.size - 1

        if (nums[pivot] == target) {
            return pivot
        }

        // decide which direction
        if (target <= nums[pivot] && target >= nums[start]) {
            // go left
            end = pivot
        } else {
            start = pivot + 1
        }

        while (start <= end) {
            val mid = (end + start) / 2
            if (target == nums[mid]) {
                return mid
            } else if (target > nums[mid]) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return -1
    }
}

fun findPivot(nums: IntArray): Int {
    var start = 0
    var end = nums.size - 1
    var pivot = 0
    while (start <= end) {
        pivot = (end + start) / 2

        if (pivot < end && nums[pivot] > nums[pivot + 1]) {
            return pivot
        } else if (pivot > start && nums[pivot] < nums[pivot - 1]) {
            return pivot - 1
        } else if (nums[start] > nums[pivot]) {
            end = pivot - 1
        } else {
            start = pivot + 1
        }
    }
    return pivot
}
