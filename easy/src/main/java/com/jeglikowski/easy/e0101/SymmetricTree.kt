package com.jeglikowski.easy.e0101

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

private class Solution {

    val leftSide = mutableListOf<Int?>()
    val rightSide = mutableListOf<Int?>()

    fun isSymmetric(root: TreeNode?): Boolean {
        return true
    }
}

fun main() {
    val solution = Solution()
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(2)
    root.left?.left = TreeNode(3)
    root.left?.right = TreeNode(4)
    root.right?.left = TreeNode(4)
    root.right?.right = TreeNode(3)
    val result = solution.isSymmetric(root)
    println(result) // true

    solution.leftSide.clear()
    solution.rightSide.clear()
    val root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(2)
    root2.left?.right = TreeNode(3)
    root2.right?.right = TreeNode(3)
    val result2 = solution.isSymmetric(root2)
    println(result2) // false

    solution.leftSide.clear()
    solution.rightSide.clear()
    val root3 = TreeNode(1)
    root3.left = TreeNode(2)
    root3.right = TreeNode(2)
    root3.left?.left = TreeNode(2)
    root3.left?.right = null
    root3.right?.left = TreeNode(2)
    root3.right?.right = null
    val result3 = solution.isSymmetric(root3)
    println(result3) // false

}