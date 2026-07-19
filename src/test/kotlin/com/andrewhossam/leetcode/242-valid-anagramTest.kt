package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `242-valid-anagramTest` {
    val sut = `242-valid-anagram`()

    @Test
    fun case1() {
        assertEquals(
            expected = true,
            actual = sut.isAnagram("anagram", "nagaram"),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = false,
            actual = sut.isAnagram("rat", "car"),
        )
    }
}
