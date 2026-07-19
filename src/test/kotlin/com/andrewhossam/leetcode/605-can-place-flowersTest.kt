package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `605-can-place-flowersTest` {
    val sut = `605-can-place-flowers`()

    @Test
    fun case1() {
        assertEquals(
            expected = true,
            actual = sut.canPlaceFlowers(intArrayOf(1,0,0,0,1), 1),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = false,
            actual = sut.canPlaceFlowers(intArrayOf(1,0,0,0,1), 2),
        )
    }
}
