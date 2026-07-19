package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `2176-count-equal-and-divisible-pairs-in-an-arrayTest` {
    val sut = `2176-count-equal-and-divisible-pairs-in-an-array`()

    @Test
    fun case1() {
        assertEquals(
            expected = 4,
            actual = sut.countPairs(intArrayOf(3,1,2,2,2,1,3), 2),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 0,
            actual = sut.countPairs(intArrayOf(1,2,3,4), 1),
        )
    }
}
