package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `14-longest-common-prefixTest` {
    val sut = `14-longest-common-prefix`()

    @Test
    fun case1() {
        assertEquals(
            expected = "fl",
            actual = sut.longestCommonPrefix(arrayOf("flower", "flow", "flight")),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = "",
            actual = sut.longestCommonPrefix(arrayOf("dog", "racecar", "car")),
        )
    }
}
