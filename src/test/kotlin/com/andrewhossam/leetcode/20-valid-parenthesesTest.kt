package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `20-valid-parenthesesTest` {
    val sut = `20-valid-parentheses`()

    @Test
    fun case1() {
        assertEquals(
            expected = true,
            actual = sut.isValid("()"),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = true,
            actual = sut.isValid("()[]{}"),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = false,
            actual = sut.isValid("(]"),
        )
    }

    @Test
    fun case4() {
        assertEquals(
            expected = true,
            actual = sut.isValid("([])"),
        )
    }

    @Test
    fun case5() {
        assertEquals(
            expected = false,
            actual = sut.isValid("([)]"),
        )
    }
}
