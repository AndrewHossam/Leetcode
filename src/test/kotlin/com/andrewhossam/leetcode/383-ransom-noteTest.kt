package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `383-ransom-noteTest` {
    val sut = `383-ransom-note`()

    @Test
    fun case1() {
        assertEquals(
            expected = false,
            actual = sut.canConstruct("a", "b"),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = false,
            actual = sut.canConstruct("aa", "ab"),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = true,
            actual = sut.canConstruct("aa", "aab"),
        )
    }
}
