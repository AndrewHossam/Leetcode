package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `1-two-sumTest` {
    val sut = `1-two-sum`()

    @Test
    fun case1() {
        assertContentEquals(
            expected = intArrayOf(0,1),
            actual = sut.twoSum(intArrayOf(2,7,11,15), 9),
        )
    }

    @Test
    fun case2() {
        assertContentEquals(
            expected = intArrayOf(1,2),
            actual = sut.twoSum(intArrayOf(3,2,4), 6),
        )
    }

    @Test
    fun case3() {
        assertContentEquals(
            expected = intArrayOf(0,1),
            actual = sut.twoSum(intArrayOf(3,3), 6),
        )
    }
}
