package com.andrewhossam

data class TreeNode(
    var `val`: Int,
) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) {
        return null
    } else {
        swap(root)
        invertTree(root.left)
        invertTree(root.right)
    }
    return root
}

fun swap(root: TreeNode) {
    val temp = root.left
    root.left = root.right
    root.right = temp
}

fun main() {
    val input =
        TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
    println(
        invertTree(input),
    )
}
