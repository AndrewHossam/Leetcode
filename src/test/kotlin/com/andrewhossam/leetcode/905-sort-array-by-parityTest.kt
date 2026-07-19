package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `905-sort-array-by-parityTest` {
    val sut = `905-sort-array-by-parity`()

    @Test
    fun case1() {
        assertContentEquals(
            expected = intArrayOf(2,4,3,1),
            actual = sut.sortArrayByParity(intArrayOf(3,1,2,4)),
        )
    }

    @Test
    fun case2() {
        assertContentEquals(
            expected = intArrayOf(0),
            actual = sut.sortArrayByParity(intArrayOf(0)),
        )
    }
}
