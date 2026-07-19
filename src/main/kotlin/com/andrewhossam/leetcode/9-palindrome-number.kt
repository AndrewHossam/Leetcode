package com.andrewhossam.leetcode

// 9. Palindrome Number
// https://leetcode.com/problems/palindrome-number/

class `9-palindrome-number` {
    fun main() {
        println(isPalindrome(121))
    }

    fun isPalindrome(x: Int): Boolean {
        val input = x.toString()
        for (i in 0 until (input.length / 2)) {
            if (input[i] != input[input.lastIndex - i]) {
                return false
            }
        }
        return true
    }
}
