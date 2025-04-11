package com.andrewhossam

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
