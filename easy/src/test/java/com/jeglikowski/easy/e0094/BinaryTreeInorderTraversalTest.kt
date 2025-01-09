package com.jeglikowski.easy.e0094

import org.junit.Assert
import org.junit.Test

class BinaryTreeInorderTraversalTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val root = TreeNode(1).apply {
            right = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }
        val result = solution.inorderTraversal(root)
        println(result) // [1, 3, 2]
        val expected = listOf(1, 3, 2)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val root = null
        val result = solution.inorderTraversal(root)
        println(result) // []
        val expected = listOf<Int>()
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val root = TreeNode(1)
        val result = solution.inorderTraversal(root)
        println(result) // [1]
        val expected = listOf(1)
        Assert.assertEquals(expected, result)
    }
}