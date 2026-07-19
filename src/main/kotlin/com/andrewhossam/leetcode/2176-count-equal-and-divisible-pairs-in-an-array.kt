package com.andrewhossam.leetcode

// 2176. Count Equal and Divisible Pairs in an Array
// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/

class `2176-count-equal-and-divisible-pairs-in-an-array` {
    // Input: nums = [3,1,2,2,2,1,3], k = 2
    fun countPairs(
        nums: IntArray,
        k: Int,
    ): Int {
        var counter = 0
        for (i in 0..nums.size - 1) {
            for (j in i + 1..nums.size - 1) {
                if ((nums[i] + nums[j]) % k == 0) {
                    counter++
                }
            }
        }
        return counter
    }
}
