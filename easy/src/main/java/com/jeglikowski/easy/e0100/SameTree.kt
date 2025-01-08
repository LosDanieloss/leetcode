package com.jeglikowski.easy.e0100

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
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return true
    }
}

fun main() {
    val solution = Solution()
    val p = TreeNode(1)
    p.left = TreeNode(2)
    p.right = TreeNode(3)
    val q = TreeNode(1)
    q.left = TreeNode(2)
    q.right = TreeNode(3)
    val result = solution.isSameTree(p, q)
    println(result) // true

    val p2 = TreeNode(1)
    p2.left = TreeNode(2)
    val q2 = TreeNode(1)
    q2.right = TreeNode(2)
    val result2 = solution.isSameTree(p2, q2)
    println(result2) // false

    val p3 = TreeNode(1)
    p3.right = TreeNode(1)
    p3.left = TreeNode(2)
    val q3 = TreeNode(1)
    q3.right = TreeNode(2)
    q3.left = TreeNode(1)
    val result3 = solution.isSameTree(p3, q3)
    println(result3) // false
}