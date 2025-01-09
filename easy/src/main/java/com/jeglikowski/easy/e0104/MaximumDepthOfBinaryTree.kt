package com.jeglikowski.easy.e0104

import java.util.Stack

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

internal class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

internal class Solution {
    var maxDepth = 0
    fun maxDepth(root: TreeNode?): Int {
        maxDepth = 0
        iterative(root, 0)
        return maxDepth
    }

    private fun iterative(root: TreeNode?, depth: Int) {
        if (root == null) {
            return
        }
        var localDepth = 0
        val levelNodesQueue = Stack<TreeNode>().apply {
            add(root)
        }
        while (levelNodesQueue.isNotEmpty()) {
            // MARK: - storing queue size in order to iterate over only on nodes
            // at level matching current local depth
            val levelQueueSize = levelNodesQueue.size
            for (i in 0..<levelQueueSize) {
                // MARK: - need to remove first rather than pop since we need FIFO rather than LIFO
                val node = levelNodesQueue.removeAt(0)
                node.left?.let {
                    levelNodesQueue.add(it)
                }
                node.right?.let {
                    levelNodesQueue.add(it)
                }
            }
            localDepth += 1
        }
        maxDepth = localDepth
    }

    private fun iterativePairs(root: TreeNode?, depth: Int) {
        if (root == null) {
            return
        }
        val crossRoadsQueue = Stack<Pair<TreeNode, Int>>().apply {
            add(root to depth)
        }
        while (crossRoadsQueue.isNotEmpty()) {
            val nextPair = crossRoadsQueue.pop()
            val node = nextPair.first
            val parentDepth = nextPair.second
            val localDepth = parentDepth + 1
            if (maxDepth < localDepth) {
                maxDepth = localDepth
            }
            // MARK: - it's better (more efficient) to not add null nodes than
            // add null and guard return early
            node.left?.let {
                crossRoadsQueue.add(it to localDepth)
            }
            node.right?.let {
                crossRoadsQueue.add(it to localDepth)
            }
        }
    }

    private fun recursive(node: TreeNode?, depth: Int) {
        if (node == null) {
            return
        }
        if (depth == maxDepth) {
            maxDepth += 1
        }
        val p = node.left
        val q = node.right
        recursive(p, depth + 1)
        recursive(q, depth + 1)
    }
}
