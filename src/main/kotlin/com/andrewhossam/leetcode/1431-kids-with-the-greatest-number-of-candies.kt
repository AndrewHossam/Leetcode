package com.andrewhossam.leetcode

// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class `1431-kids-with-the-greatest-number-of-candies` {
    fun kidsWithCandies(
        candies: IntArray,
        extraCandies: Int,
    ): List<Boolean> {
        val list = mutableListOf<Boolean>()
        var max = 0
        for (candy in candies) {
            if (max < candy) {
                max = candy
            }
        }

        for (candy in candies) {
            if (candy + extraCandies >= max) {
                list.add(true)
            } else {
                list.add(false)
            }
        }
        return list
    }
}
