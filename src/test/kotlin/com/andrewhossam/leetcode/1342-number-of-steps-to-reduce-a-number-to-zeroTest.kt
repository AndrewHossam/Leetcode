package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `1342-number-of-steps-to-reduce-a-number-to-zeroTest` {
    val sut = `1342-number-of-steps-to-reduce-a-number-to-zero`()

    @Test
    fun case1() {
        assertEquals(
            expected = 6,
            actual = sut.numberOfSteps(14),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 4,
            actual = sut.numberOfSteps(8),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = 12,
            actual = sut.numberOfSteps(123),
        )
    }
}
