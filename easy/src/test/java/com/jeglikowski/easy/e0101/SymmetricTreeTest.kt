package com.jeglikowski.easy.e0101

import org.junit.Assert
import org.junit.Test

class SymmetricTreeTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(3)
            }
        }
        val result = solution.isSymmetric(root)
        println(result) // true
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                right = TreeNode(3)
            }
            right = TreeNode(2).apply {
                right = TreeNode(3)
            }
        }
        val result = solution.isSymmetric(root)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(2)
            }
            right = TreeNode(2).apply {
                left = TreeNode(2)
            }
        }
        val result = solution.isSymmetric(root)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val root = TreeNode(1)
        val result = solution.isSymmetric(root)
        println(result) // true
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(2)
        }
        val result = solution.isSymmetric(root)
        println(result) // true
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseSix() {
        val solution = Solution()
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(1)
            }
            right = TreeNode(2)
        }
        val result = solution.isSymmetric(root)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseSeven() {
        val solution = Solution()
        val root = TreeNode(1).apply {
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
        val result = solution.isSymmetric(root)
        println(result) // false
        val expected = true
        Assert.assertEquals(expected, result)
    }
}