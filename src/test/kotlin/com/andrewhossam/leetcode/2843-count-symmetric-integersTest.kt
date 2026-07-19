package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `2843-count-symmetric-integersTest` {
    val sut = `2843-count-symmetric-integers`()

    @Test
    fun Test1() {
        assertEquals(
            9,
            sut.countSymmetricIntegers(1, 100),
        )
    }

    @Test
    fun Test2() {
        assertEquals(4, sut.countSymmetricIntegers(1200, 1230))
    }
}
