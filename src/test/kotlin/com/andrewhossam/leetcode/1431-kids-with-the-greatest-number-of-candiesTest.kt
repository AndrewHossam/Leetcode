package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `1431-kids-with-the-greatest-number-of-candiesTest` {
    val sut = `1431-kids-with-the-greatest-number-of-candies`()

    @Test
    fun case1() {
        assertEquals(
            expected = listOf(true, true, true, false, true),
            actual = sut.kidsWithCandies(intArrayOf(2,3,5,1,3), 3),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = listOf(true, false, false, false, false),
            actual = sut.kidsWithCandies(intArrayOf(4,2,1,1,2), 1),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = listOf(true, false, true),
            actual = sut.kidsWithCandies(intArrayOf(12,1,12), 10),
        )
    }
}
