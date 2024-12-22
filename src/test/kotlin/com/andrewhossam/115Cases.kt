package com.andrewhossam

import kotlin.test.Test
import kotlin.test.assertEquals

class `115Cases` {
    val sut = `115-find-minimum-in-rotated-sorted-array`()

    @Test
    fun case1() {
        assertEquals(
            expected = 1,
            actual = sut.findMin(intArrayOf(3, 4, 5, 1, 2)),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 0,
            actual = sut.findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2)),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = 11,
            actual = sut.findMin(intArrayOf(11, 13, 15, 17)),
        )
    }
}
