package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `485-max-consecutive-onesTest` {
    val sut = `485-max-consecutive-ones`()

    @Test
    fun case1() {
        assertEquals(
            expected = 3,
            actual = sut.findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = 2,
            actual = sut.findMaxConsecutiveOnes(intArrayOf(1,0,1,1,0,1)),
        )
    }
}
