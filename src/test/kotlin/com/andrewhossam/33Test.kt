package com.andrewhossam

import kotlin.test.Test
import kotlin.test.assertEquals

class `33Test` {
    val sut = `33-search-in-rotated-sorted-array`()

    @Test
    fun case1() {
        assertEquals(
            expected = 4,
            actual = sut.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = -1,
            actual = sut.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = -1,
            actual = sut.search(intArrayOf(1), 0),
        )
    }

    @Test
    fun case187() {
        assertEquals(
            expected = 1,
            actual = sut.search(intArrayOf(3, 1), 1),
        )
    }

    @Test
    fun case193() {
        assertEquals(
            expected = 1,
            actual = sut.search(intArrayOf(8, 9, 2, 3, 4), 9),
        )
    }
}
