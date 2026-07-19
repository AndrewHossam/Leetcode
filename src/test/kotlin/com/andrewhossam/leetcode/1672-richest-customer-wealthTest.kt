package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `1672-richest-customer-wealthTest` {
    val sut = `1672-richest-customer-wealth`()

    @Test
    fun case1() {
        assertEquals(
            expected = 6,
            actual = sut.maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 10,
            actual = sut.maximumWealth(arrayOf(intArrayOf(1,5), intArrayOf(7,3), intArrayOf(3,5))),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = 17,
            actual = sut.maximumWealth(arrayOf(intArrayOf(2,8,7), intArrayOf(7,1,3), intArrayOf(1,9,5))),
        )
    }
}
