package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `13-roman-to-integerTest` {
    val sut = `13-roman-to-integer`()

    @Test
    fun case1() {
        assertEquals(
            expected = 3,
            actual = sut.romanToInt("III"),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 58,
            actual = sut.romanToInt("LVIII"),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = 1994,
            actual = sut.romanToInt("MCMXCIV"),
        )
    }
}
