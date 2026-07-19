package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `226-invert-binary-treeTest` {
    val sut = `226-invert-binary-tree`()

    private fun n(v: Int, l: TreeNode? = null, r: TreeNode? = null) = TreeNode(v).apply { left = l; right = r }

    @Test
    fun case1() {
        // [2,1,3] inverts to [2,3,1]
        assertEquals(n(2, n(3), n(1)), sut.invertTree(n(2, n(1), n(3))))
    }

    @Test
    fun case2() {
        assertEquals(null, sut.invertTree(null))
    }
}
