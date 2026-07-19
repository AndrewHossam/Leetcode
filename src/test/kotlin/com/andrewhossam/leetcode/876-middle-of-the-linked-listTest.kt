package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `876-middle-of-the-linked-listTest` {
    val sut = `876-middle-of-the-linked-list`()

    private fun list(vararg vals: Int): ListNode? {
        if (vals.isEmpty()) return null
        var cur = ListNode(vals[0])
        val head = cur
        for (v in vals.drop(1)) {
            cur.next = ListNode(v)
            cur = cur.next!!
        }
        return head
    }

    @Test
    fun case1() {
        // [1,2,3,4,5] -> middle node (val 3)
        assertEquals(3, sut.middleNode(list(1, 2, 3, 4, 5))!!.`val`)
    }

    @Test
    fun case2() {
        // [1,2,3,4,5,6] -> middle node (val 4)
        assertEquals(4, sut.middleNode(list(1, 2, 3, 4, 5, 6))!!.`val`)
    }
}
