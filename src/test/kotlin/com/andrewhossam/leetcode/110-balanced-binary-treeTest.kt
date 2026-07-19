package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `110-balanced-binary-treeTest` {
    val sut = `110-balanced-binary-tree`()

    private fun n(v: Int, l: TreeNode? = null, r: TreeNode? = null) = TreeNode(v).apply { left = l; right = r }

    @Test
    fun case1() {
        // [3,9,20,null,null,15,7] -> balanced
        assertEquals(true, sut.isBalanced(n(3, n(9), n(20, n(15), n(7)))))
    }

    @Test
    fun case2() {
        // [1,2,2,3,3,null,null,4,4] -> not balanced
        assertEquals(false, sut.isBalanced(n(1, n(2, n(3, n(4), n(4)), n(3)), n(2))))
    }

    @Test
    fun case3() {
        assertEquals(true, sut.isBalanced(null))
    }
}
