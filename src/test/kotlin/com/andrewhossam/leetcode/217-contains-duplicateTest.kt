package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `217-contains-duplicateTest` {
    val sut = `217-contains-duplicate`()

    @Test
    fun case1() {
        assertEquals(
            expected = true,
            actual = sut.containsDuplicate(intArrayOf(1,2,3,1)),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = false,
            actual = sut.containsDuplicate(intArrayOf(1,2,3,4)),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = true,
            actual = sut.containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2)),
        )
    }
}
