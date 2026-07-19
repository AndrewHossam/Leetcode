package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `122-best-time-to-buy-and-sell-stock-iiTest` {
    val sut = `122-best-time-to-buy-and-sell-stock-ii`()

    @Test
    fun case1() {
        assertEquals(
            expected = 7,
            actual = sut.maxProfit(intArrayOf(7,1,5,3,6,4)),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 4,
            actual = sut.maxProfit(intArrayOf(1,2,3,4,5)),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = 0,
            actual = sut.maxProfit(intArrayOf(7,6,4,3,1)),
        )
    }
}
