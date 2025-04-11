package com.andrewhossam

class `34-find-first-and-last-position-of-element-in-sorted-array` {
    fun searchRange(
        nums: IntArray,
        target: Int,
    ): IntArray {
        var foundTargetIndex = -1

        var start = 0
        var end = nums.size - 1

        while (start <= end) {
            val mid = (end + start) / 2
            if (nums[mid] == target) {
                foundTargetIndex = mid
                break
            } else if (nums[mid] < target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return if (foundTargetIndex == -1) {
            intArrayOf(-1, -1)
        } else {
            findStartAndEnd(nums, target, foundTargetIndex)
        }
    }

    private fun findStartAndEnd(
        nums: IntArray,
        target: Int,
        foundTargetIndex: Int,
    ): IntArray {
        var start = foundTargetIndex
        var end = foundTargetIndex
        for (i in foundTargetIndex + 1..<nums.size) {
            if (nums[i] == target) {
                end = i
            } else {
                break
            }
        }

        for (i in foundTargetIndex - 1 downTo 0) {
            if (nums[i] == target) {
                start = i
            } else {
                break
            }
        }

        return intArrayOf(start, end)
    }

    fun bruteForce(
        nums: IntArray,
        target: Int,
    ): IntArray {
        var start = -1
        var end = -1
        for (i in 0..<nums.size) {
            if (nums[i] == target) {
                start = i
                break
            }
        }

        for (i in nums.size - 1 downTo 0) {
            if (nums[i] == target) {
                end = i
                break
            }
        }

        return intArrayOf(start, end)
    }
}
