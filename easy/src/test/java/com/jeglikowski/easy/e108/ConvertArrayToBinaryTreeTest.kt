package com.jeglikowski.easy.e108

import org.junit.Assert
import org.junit.Test
import com.jeglikowski.easy.e0100.Solution as Validator
import com.jeglikowski.easy.e0100.TreeNode

class ConvertArrayToBinaryTreeTest {

    @Test
    fun useCaseOne() {
        val validator = Validator()
        val solution = Solution()
        val nums = listOf(-10,-3,0,5,9).toIntArray()
        val resultTree = solution.sortedArrayToBST(nums)
        val expectedTree = TreeNode(0).apply {
            left = TreeNode(-3).apply {
                left = TreeNode(-10)
            }
            right = TreeNode(9).apply {
                left = TreeNode(5)
            }
        }
        val result = validator.isSameTree(expectedTree, resultTree);
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val validator = Validator()
        val solution = Solution()
        val nums = listOf(1,3).toIntArray()
        val resultTree = solution.sortedArrayToBST(nums)
        val expectedTree = TreeNode(3).apply {
            left = TreeNode(1)
        }
        val result = validator.isSameTree(expectedTree, resultTree);
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val validator = Validator()
        val solution = Solution()
        val nums = listOf(1).toIntArray()
        val resultTree = solution.sortedArrayToBST(nums)
        val expectedTree = TreeNode(1)
        val result = validator.isSameTree(expectedTree, resultTree);
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val validator = Validator()
        val solution = Solution()
        val nums = listOf(0,1,2,3,4,5).toIntArray()
        val resultTree = solution.sortedArrayToBST(nums)
        val expectedTree = TreeNode(3).apply {
            left = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(2)
            }
            right = TreeNode(5).apply {
                left = TreeNode(4)
            }
        }
        val result = validator.isSameTree(expectedTree, resultTree);
        val expected = true
        Assert.assertEquals(expected, result)
    }
}