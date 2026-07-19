package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `155-min-stackTest` {
    @Test
    fun case1() {
        // LeetCode example: push -2,0,-3; getMin=-3; pop; top=0; getMin=-2
        val s = `155-min-stack`()
        s.push(-2)
        s.push(0)
        s.push(-3)
        assertEquals(-3, s.getMin())
        s.pop()
        assertEquals(0, s.top())
        assertEquals(-2, s.getMin())
    }
}
