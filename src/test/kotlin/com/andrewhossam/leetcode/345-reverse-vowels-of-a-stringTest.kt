package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `345-reverse-vowels-of-a-stringTest` {
    val sut = `345-reverse-vowels-of-a-string`()

    @Test
    fun case1() {
        assertEquals(
            expected = "AceCreIm",
            actual = sut.reverseVowels("IceCreAm"),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = "leotcede",
            actual = sut.reverseVowels("leetcode"),
        )
    }
}
