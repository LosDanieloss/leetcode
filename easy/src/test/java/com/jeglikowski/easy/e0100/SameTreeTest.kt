package com.jeglikowski.easy.e0100

import org.junit.Assert
import org.junit.Test

class SameTreeTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val p = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        val q = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        val result = solution.isSameTree(p, q)
        println(result) // true
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val p = TreeNode(1).apply {
            left = TreeNode(2)
        }
        val q = TreeNode(1).apply {
            right = TreeNode(2)
        }
        val result = solution.isSameTree(p, q)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val p = TreeNode(1).apply {
            right = TreeNode(1)
            left = TreeNode(2)
        }
        val q = TreeNode(1).apply {
            right = TreeNode(2)
            left = TreeNode(1)
        }
        val result = solution.isSameTree(p, q)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val p = TreeNode(2).apply {
            left = TreeNode(2).apply {
                right = TreeNode(2).apply {
                    left = TreeNode(2)
                }
            }
            right = TreeNode(2)
        }
        val q = TreeNode(2).apply {
            left = TreeNode(2).apply {
                left = TreeNode(2)
            }
            right = TreeNode(2).apply {
                left = TreeNode(2)
            }
        }
        val result = solution.isSameTree(p, q)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val p = TreeNode(5).apply {
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
        val q = TreeNode(5).apply {
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
        val result = solution.isSameTree(p, q)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }
}