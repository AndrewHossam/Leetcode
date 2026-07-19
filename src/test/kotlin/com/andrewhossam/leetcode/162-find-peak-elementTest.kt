package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `162-find-peak-elementTest` {
    val sut = `162-find-peak-element`()

    @Test
    fun case1() {
        assertEquals(
            expected = 2,
            actual = sut.findPeakElement(intArrayOf(1,2,3,1)),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 5,
            actual = sut.findPeakElement(intArrayOf(1,2,1,3,5,6,4)),
        )
    }
}
