package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `1768-merge-strings-alternatelyTest` {
    val sut = `1768-merge-strings-alternately`()

    @Test
    fun case1() {
        assertEquals(
            expected = "apbqcr",
            actual = sut.mergeAlternately("abc", "pqr"),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = "apbqrs",
            actual = sut.mergeAlternately("ab", "pqrs"),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = "apbqcd",
            actual = sut.mergeAlternately("abcd", "pq"),
        )
    }
}
