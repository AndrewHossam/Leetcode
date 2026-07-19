package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `125-valid-palindromeTest` {
    val sut = `125-valid-palindrome`()

    @Test
    fun case1() {
        assertEquals(
            expected = true,
            actual = sut.isPalindrome("A man, a plan, a canal: Panama"),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = false,
            actual = sut.isPalindrome("race a car"),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = true,
            actual = sut.isPalindrome(" "),
        )
    }
}
