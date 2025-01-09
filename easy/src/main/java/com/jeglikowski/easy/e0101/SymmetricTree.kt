package com.jeglikowski.easy.e0101

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
    fun isSymmetric(root: TreeNode?): Boolean {
        return iterative(root)
    }

    private fun iterative(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        val crossRoadsQueue = Stack<TreeNode?>().apply {
            add(root.left)
            add(root.right)
        }
        while (crossRoadsQueue.isNotEmpty()) {
            val p = crossRoadsQueue.pop()
            val q = crossRoadsQueue.pop()
            if (p == null && q == null) {
                continue
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
            crossRoadsQueue.add(p.left)
            crossRoadsQueue.add(q.right)
            crossRoadsQueue.add(p.right)
            crossRoadsQueue.add(q.left)
        }

        return true
    }

    private fun iterativePairs(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        var p = root.left
        var q = root.right
        val crossRoadsQueue = Stack<Pair<TreeNode?, TreeNode?>>().apply {
            add(root.left to root.right)
        }
        while (crossRoadsQueue.isNotEmpty()) {
            val nextPair = crossRoadsQueue.pop()
            p = nextPair?.first
            q = nextPair?.second
            if (p == null && q == null) {
                continue
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
            crossRoadsQueue.add(p.left to q.right)
            crossRoadsQueue.add(p.right to q.left)
        }

        return p?.`val` == q?.`val`
    }

    private fun recursive(p: TreeNode?, q: TreeNode?): Boolean {
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
        val isInnerSame = recursive(p.right, q.left)
        val isOuterSame = recursive(p.left, q.right)
        return isInnerSame && isOuterSame
    }
}
