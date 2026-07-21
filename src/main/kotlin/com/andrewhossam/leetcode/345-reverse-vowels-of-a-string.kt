package com.andrewhossam.leetcode

import com.andrewhossam.swape

// 345. Reverse Vowels of a String
// https://leetcode.com/problems/reverse-vowels-of-a-string/
class `345-reverse-vowels-of-a-string` {
    fun reverseVowels(s: String): String {
        if (s.isEmpty()) return s
        var left = 0
        var right = s.length - 1
        val result = s.toCharArray()
        while (left < right) {
            val isLeftVowel = s[left].isVowel()
            val isRightVowel = s[right].isVowel()
            if (isLeftVowel.not() && isRightVowel.not()) {
                left++
                right--
            } else if (isLeftVowel && isRightVowel) {
                result.swape(left, right)
                left++
                right--
            } else if (isLeftVowel) {
                right--
            } else {
                left++
            }
        }
        return String(result)
        // another solution one loop for detecting them, and another loop for swaping them
    }

    fun Char.isVowel() = this == 'a' || this == 'e' || this == 'i' || this == 'o' || this == 'u' ||
            this == 'A' || this == 'E' || this == 'I' || this == 'O' || this == 'U'
}
