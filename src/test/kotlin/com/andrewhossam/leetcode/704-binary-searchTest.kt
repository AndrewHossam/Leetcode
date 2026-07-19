package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `704-binary-searchTest` {
    val sut = `704-binary-search`()

    @Test
    fun case1() {
        assertEquals(
            expected = 4,
            actual = sut.search(intArrayOf(-1,0,3,5,9,12), 9),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = -1,
            actual = sut.search(intArrayOf(-1,0,3,5,9,12), 2),
        )
    }
}
