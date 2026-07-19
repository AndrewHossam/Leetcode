package com.andrewhossam.leetcode

// 1342. Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class `1342-number-of-steps-to-reduce-a-number-to-zero` {
    fun numberOfSteps(num: Int): Int {
        var reminder = num
        var steps = 0
        while (reminder != 0) {
            if (reminder % 2 == 0) {
                reminder /= 2
                steps++
            } else {
                reminder--
                steps++
            }
        }
        return steps
    }

    fun numberOfSteps2(num: Int): Int =
        if (num == 0) {
            0
        } else if (num % 2 == 0) {
            numberOfSteps(num / 2) + 1
        } else {
            numberOfSteps(num - 1) + 1
        }

    fun main() {
        println(
            numberOfSteps(90),
        )
        println(
            numberOfSteps2(90),
        )
    }
}
