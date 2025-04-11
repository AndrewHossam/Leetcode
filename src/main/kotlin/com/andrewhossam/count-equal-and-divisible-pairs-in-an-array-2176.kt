package com.andrewhossam

class `count-equal-and-divisible-pairs-in-an-array-2176` {
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
