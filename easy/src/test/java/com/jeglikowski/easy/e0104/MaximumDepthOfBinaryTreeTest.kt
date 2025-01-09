package com.jeglikowski.easy.e0104

import org.junit.Assert
import org.junit.Test

class MaximumDepthOfBinaryTreeTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        val result = solution.maxDepth(root)
        println(result) // 3
        val expected = 3
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val root = TreeNode(0)
        val result = solution.maxDepth(root)
        println(result) // 1
        val expected = 1
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val root = null
        val result = solution.maxDepth(root)
        println(result) // 0
        val expected = 0
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val root = TreeNode(0).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4)
            }
            right = TreeNode(3).apply {
                right = TreeNode(5)
            }
        }
        val result = solution.maxDepth(root)
        println(result) // 3
        val expected = 3
        Assert.assertEquals(expected, result)
    }
}