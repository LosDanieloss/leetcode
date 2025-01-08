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
        return check(p, q)
    }

    fun check(p: TreeNode?, q: TreeNode?): Boolean {
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

    val p4 = TreeNode(2).apply {
        left = TreeNode(2).apply {
            right = TreeNode(2).apply {
                left = TreeNode(2)
            }
        }
        right = TreeNode(2)
    }
    val q4 = TreeNode(2).apply {
        left = TreeNode(2).apply {
            left = TreeNode(2)
        }
        right = TreeNode(2).apply {
            left = TreeNode(2)
        }
    }
    val result4 = solution.isSameTree(p4, q4)
    println(result4) // false

    val p5 = TreeNode(5).apply {
        left = TreeNode(4).apply {
            right = TreeNode(1).apply {
                left = TreeNode(2)
            }
        }
        right = TreeNode(1).apply {
            right = TreeNode(4).apply {
                left = TreeNode(2)
            }
        }
    }
    val q5 = TreeNode(5).apply {
        left = TreeNode(1).apply {
            left = TreeNode(4).apply {
                right = TreeNode(2)
            }
        }
        right = TreeNode(4).apply {
            left = TreeNode(1).apply {
                right = TreeNode(2)
            }
        }
    }
    val result5 = solution.isSameTree(p5, q5)
    println(result5) // false
}