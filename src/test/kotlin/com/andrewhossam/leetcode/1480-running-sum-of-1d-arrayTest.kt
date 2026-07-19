package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `1480-running-sum-of-1d-arrayTest` {
    val sut = `1480-running-sum-of-1d-array`()

    @Test
    fun case1() {
        assertContentEquals(
            expected = intArrayOf(1,3,6,10),
            actual = sut.runningSum(intArrayOf(1,2,3,4)),
        )
    }

    @Test
    fun case2() {
        assertContentEquals(
            expected = intArrayOf(1,2,3,4,5),
            actual = sut.runningSum(intArrayOf(1,1,1,1,1)),
        )
    }

    @Test
    fun case3() {
        assertContentEquals(
            expected = intArrayOf(3,4,6,16,17),
            actual = sut.runningSum(intArrayOf(3,1,2,10,1)),
        )
    }
}
