package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `3005-count-elements-with-maximum-frequencyTest` {
    val sut = `3005-count-elements-with-maximum-frequency`()

    @Test
    fun test1() {
        assertEquals(
            4,
            sut.maxFrequencyElements(
                intArrayOf(1, 2, 2, 3, 1, 4),
            ),
        )
    }

    @Test
    fun test2() {
        assertEquals(
            5,
            sut.maxFrequencyElements(
                intArrayOf(1, 2, 3, 4, 5),
            ),
        )
    }

    @Test
    fun test15() {
        assertEquals(
            1,
            sut.maxFrequencyElements(
                intArrayOf(15),
            ),
        )
    }
}
