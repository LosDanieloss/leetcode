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

private class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

// Recursive 1

private class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val order = mutableListOf<Int>()
        traverse(root, order)
        return order
    }

    fun traverse(root: TreeNode?, order: MutableList<Int>) {
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

    fun inorderTraversalVersionFirst(root: TreeNode?): List<Int> {
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

fun main() {
    val solution = Solution()
    val root = TreeNode(1)
    root.right = TreeNode(2)
    root.right?.left = TreeNode(3)
    val result = solution.inorderTraversal(root)
    println(result) // [1, 3, 2]

    val root2 = null
    val result2 = solution.inorderTraversal(root2)
    println(result2) // []

    val root3 = TreeNode(1)
    val result3 = solution.inorderTraversal(root3)
    println(result3) // [1]
}