package com.andrewhossam

import kotlin.math.abs
import kotlin.math.max

fun isBalanced(root: TreeNode?): Boolean = dfs(root).first

fun dfs(root: TreeNode?): Pair<Boolean, Int> {
    if (root == null) return Pair(true, 0)
    val left = dfs(root.left)
    val right = dfs(root.right)

    val balanced =
        left.first &&
            right.first &&
            abs(left.second - right.second) <= 1
    return Pair(balanced, 1 + max(left.second, right.second))
}

fun main() {
    println(
        isBalanced(
            TreeNode(1).apply {
                left =
                    TreeNode(2).apply {
                        left =
                            TreeNode(3).apply {
                                left = TreeNode(4)
                                right = TreeNode(4)
                            }
                        right = TreeNode(3)
                    }
                right = TreeNode(2)
            },
        ),
    )
}
