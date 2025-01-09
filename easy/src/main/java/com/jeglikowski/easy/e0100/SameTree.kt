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

internal class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

internal class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return check(p, q)
    }

    private fun check(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }
        if (p == null) {
            return false
        }
        if (q == null) {
            return false
        }
        if (p.`val` != q.`val`) {
            return false
        }
        val isLeftSame = check(p.left, q.left)
        val isRightSame = check(p.right, q.right)
        return isLeftSame && isRightSame
    }
}
