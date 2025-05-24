package com.andrewhossam

import kotlin.test.Test
import kotlin.test.assertEquals

class _3005Test {
    @Test
    fun test1() {
        assertEquals(
            4,
            maxFrequencyElements(
                intArrayOf(1, 2, 2, 3, 1, 4),
            ),
        )
    }

    @Test
    fun test2() {
        assertEquals(
            5,
            maxFrequencyElements(
                intArrayOf(1, 2, 3, 4, 5),
            ),
        )
    }

    @Test
    fun test15() {
        assertEquals(
            1,
            maxFrequencyElements(
                intArrayOf(15),
            ),
        )
    }
}
