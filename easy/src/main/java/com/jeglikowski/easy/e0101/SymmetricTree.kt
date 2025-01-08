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

private class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

private class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return iterative(root)
    }

    fun iterative(root: TreeNode?): Boolean {
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

    fun iterativePairs(root: TreeNode?): Boolean {
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

    fun recursive(p: TreeNode?, q: TreeNode?): Boolean {
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

    val root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(2)
    root2.left?.right = TreeNode(3)
    root2.right?.right = TreeNode(3)
    val result2 = solution.isSymmetric(root2)
    println(result2) // false

    val root3 = TreeNode(1)
    root3.left = TreeNode(2)
    root3.right = TreeNode(2)
    root3.left?.left = TreeNode(2)
    root3.left?.right = null
    root3.right?.left = TreeNode(2)
    root3.right?.right = null
    val result3 = solution.isSymmetric(root3)
    println(result3) // false

    val root4 = TreeNode(1)
    val result4 = solution.isSymmetric(root4)
    println(result4) // true

    val root5 = TreeNode(1).apply {
        left = TreeNode(2)
        right = TreeNode(2)
    }
    val result5 = solution.isSymmetric(root5)
    println(result5) // true

    val root6 = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(1)
        }
        right = TreeNode(2)
    }
    val result6 = solution.isSymmetric(root6)
    println(result6) // false

    val root7 = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(1).apply {
                left = TreeNode(2)
            }
        }
        right = TreeNode(2).apply {
            right = TreeNode(1).apply {
                right = TreeNode(2)
            }
        }
    }
    val result7 = solution.isSymmetric(root7)
    println(result7) // false

}