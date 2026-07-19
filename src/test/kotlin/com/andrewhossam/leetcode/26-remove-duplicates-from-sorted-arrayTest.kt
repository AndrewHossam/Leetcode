package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `26-remove-duplicates-from-sorted-arrayTest` {
    val sut = `26-remove-duplicates-from-sorted-array`()

    @Test
    fun case1() {
        // Input: [1,1,2]
        assertEquals(
            expected = TODO("expected output"),
            actual = sut.removeDuplicates(intArrayOf(1,1,2)),
        )
    }

    @Test
    fun case2() {
        // Input: [0,0,1,1,1,2,2,3,3,4]
        assertEquals(
            expected = TODO("expected output"),
            actual = sut.removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)),
        )
    }
}
