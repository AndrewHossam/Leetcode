package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `977-squares-of-a-sorted-arrayTest` {
    val sut = `977-squares-of-a-sorted-array`()

    @Test
    fun case1() {
        assertContentEquals(
            expected = intArrayOf(0,1,9,16,100),
            actual = sut.sortedSquares(intArrayOf(-4,-1,0,3,10)),
        )
    }

    @Test
    fun case2() {
        assertContentEquals(
            expected = intArrayOf(4,9,9,49,121),
            actual = sut.sortedSquares(intArrayOf(-7,-3,2,3,11)),
        )
    }
}
