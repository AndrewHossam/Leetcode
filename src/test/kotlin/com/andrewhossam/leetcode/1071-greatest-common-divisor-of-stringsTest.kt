package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `1071-greatest-common-divisor-of-stringsTest` {
    val sut = `1071-greatest-common-divisor-of-strings`()

    @Test
    fun case1() {
        assertEquals(
            expected = "ABC",
            actual = sut.gcdOfStrings("ABCABC", "ABC"),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = "AB",
            actual = sut.gcdOfStrings("ABABAB", "ABAB"),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = "",
            actual = sut.gcdOfStrings("LEET", "CODE"),
        )
    }

    @Test
    fun case4() {
        assertEquals(
            expected = "",
            actual = sut.gcdOfStrings("AAAAAB", "AAA"),
        )
    }
}
