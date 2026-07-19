package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `9-palindrome-numberTest` {
    val sut = `9-palindrome-number`()

    @Test
    fun case1() {
        assertEquals(
            expected = true,
            actual = sut.isPalindrome(121),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = false,
            actual = sut.isPalindrome(-121),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = false,
            actual = sut.isPalindrome(10),
        )
    }
}
