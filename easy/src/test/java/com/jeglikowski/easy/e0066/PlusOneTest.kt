package com.jeglikowski.easy.e0066

import org.junit.Assert
import org.junit.Test

class PlusOneTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val digits = intArrayOf(1, 2, 3)
        val result = solution.plusOne(digits).toList()
        println(result.toList()) // [1, 2, 4]
        val expected = listOf(1, 2, 4)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val digits = intArrayOf(4, 3, 2, 1)
        val result = solution.plusOne(digits).toList()
        println(result.toList()) // [4, 3, 2, 2]
        val expected = listOf(4, 3, 2, 2)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val digits = intArrayOf(9)
        val result = solution.plusOne(digits).toList()
        println(result.toList()) // [1, 0]
        val expected = listOf(1, 0)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val digits = intArrayOf(9, 9)
        val result = solution.plusOne(digits).toList()
        println(result.toList()) // [1, 0, 0]
        val expected = listOf(1, 0, 0)
        Assert.assertEquals(expected, result)
    }
}