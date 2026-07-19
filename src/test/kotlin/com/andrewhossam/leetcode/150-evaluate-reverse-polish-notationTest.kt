package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `150-evaluate-reverse-polish-notationTest` {
    val sut = `150-evaluate-reverse-polish-notation`()

    @Test
    fun case1() {
        assertEquals(
            expected = 9,
            actual = sut.evalRPN(arrayOf("2", "1", "+", "3", "*")),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 6,
            actual = sut.evalRPN(arrayOf("4", "13", "5", "/", "+")),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = 22,
            actual = sut.evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")),
        )
    }
}
