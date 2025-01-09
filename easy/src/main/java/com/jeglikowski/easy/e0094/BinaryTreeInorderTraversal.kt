package com.jeglikowski.easy.e0094

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

// Recursive 1

internal class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val order = mutableListOf<Int>()
        traverse(root, order)
        return order
    }

    private fun traverse(root: TreeNode?, order: MutableList<Int>) {
        if (root == null) {
            return
        }
        if (root.left != null) {
            traverse(root.left, order)
        }
        order.add(root.`val`)
        if (root.right != null) {
            traverse(root.right, order)
        }
    }

    private fun inorderTraversalVersionFirst(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }
        if (root.left == null && root.right == null) {
            return listOf(root.`val`)
        }
        val leftTraversal = if (root.left != null) {
            inorderTraversal(root.left)
        } else {
            emptyList()
        }
        val rightTraversal = if (root.right != null) {
            inorderTraversal(root.right)
        } else {
            emptyList()
        }
        return leftTraversal + listOf(root.`val`) + rightTraversal
    }
}
