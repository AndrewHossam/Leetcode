import java.util.*


fun printTree(tree: TreeNode): List<Int> {
    // Create a queue to store the nodes that have been visited.
    val queue = LinkedList<TreeNode>()

    // Mark the root node as visited.
    queue.add(tree)

    // Create a list to store the results.
    val results = mutableListOf<Int>()

    // While the queue is not empty, do the following:
    while (queue.isNotEmpty()) {
        // Remove the first node from the queue.
        val node = queue.remove()

        // Add the node's left child to the queue if it exists.
        if (node.left != null) {
            queue.add(node.left!!)
        }

        // Add the node's right child to the queue if it exists.
        if (node.right != null) {
            queue.add(node.right!!)
        }

        // Add the node to the results list.
        results.add(node.`val`)
    }

    // Return the results.
    return results
}


fun searchDFS(tree: TreeNode?, target: Int): Boolean {
    if (tree == null) return false
    if (tree.`val` == target) return true
    val left = searchDFS(tree.left, target)
    val right = searchDFS(tree.right, target)
    return left || right
}

fun searchBFS(tree: TreeNode?, target: Int): Boolean {
    if (tree == null) return false
    if (tree.`val` == target) return true
    return searchBFS(tree.left, target) || searchBFS(tree.right, target)
}

fun main() {
    val tree = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(4).apply {
                left = TreeNode(6)
                right = TreeNode(7)
            }
            right = TreeNode(5)
        }
        right = TreeNode(3)
    }
    for (i in 0..100) {
        println(
            searchBFS(tree, i)
        )
    }
}
