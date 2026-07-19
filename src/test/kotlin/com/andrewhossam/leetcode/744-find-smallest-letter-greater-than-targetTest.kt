package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `744-find-smallest-letter-greater-than-targetTest` {
    val sut = `744-find-smallest-letter-greater-than-target`()

    @Test
    fun case1() {
        assertEquals(
            'c',
            sut.nextGreatestLetter(
                charArrayOf('c', 'f', 'j'),
                'a',
            ),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            'f',
            sut.nextGreatestLetter(
                charArrayOf('c', 'f', 'j'),
                'c',
            ),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            'x',
            sut.nextGreatestLetter(
                charArrayOf('x', 'x', 'y', 'y'),
                'z',
            ),
        )
    }

    @Test
    fun case4() {
        assertEquals(
            'c',
            sut.nextGreatestLetter(
                charArrayOf('c', 'f', 'j'),
                'j',
            ),
        )
    }
}
