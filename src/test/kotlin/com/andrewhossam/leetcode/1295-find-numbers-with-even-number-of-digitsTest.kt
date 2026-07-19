package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `1295-find-numbers-with-even-number-of-digitsTest` {
    val sut = `1295-find-numbers-with-even-number-of-digits`()

    @Test
    fun case1() {
        assertEquals(
            expected = 2,
            actual = sut.findNumbers(intArrayOf(12,345,2,6,7896)),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 1,
            actual = sut.findNumbers(intArrayOf(555,901,482,1771)),
        )
    }
}
