package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `231-power-of-twoTest` {
    val sut = `231-power-of-two`()

    @Test
    fun case1() {
        assertEquals(
            expected = true,
            actual = sut.isPowerOfTwo(1),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = true,
            actual = sut.isPowerOfTwo(16),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = false,
            actual = sut.isPowerOfTwo(3),
        )
    }
}
