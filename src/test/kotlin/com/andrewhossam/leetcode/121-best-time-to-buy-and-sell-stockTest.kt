package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `121-best-time-to-buy-and-sell-stockTest` {
    val sut = `121-best-time-to-buy-and-sell-stock`()

    @Test
    fun case1() {
        assertEquals(
            expected = 5,
            actual = sut.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 0,
            actual = sut.maxProfit(intArrayOf(7, 6, 4, 3, 1)),
        )
    }

    @Test
    fun case91() {
        assertEquals(
            expected = 3,
            actual = sut.maxProfit(intArrayOf(1, 4, 2)),
        )
    }

    @Test
    fun case150() {
        assertEquals(
            expected = 4,
            actual = sut.maxProfit(intArrayOf(3,2,6,5,0,3)),
        )
    }
}
