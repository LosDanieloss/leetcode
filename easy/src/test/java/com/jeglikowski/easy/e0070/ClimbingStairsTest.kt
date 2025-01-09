package com.jeglikowski.easy.e0070

import org.junit.Assert
import org.junit.Test

class ClimbingStairsTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val n = 2
        val result = solution.climbStairs(n)
        println(result) // 2
        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val n = 3
        val result = solution.climbStairs(n)
        println(result) // 3
        val expected = 3
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val n = 4
        val result = solution.climbStairs(n)
        println(result) // 5
        val expected = 5
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val n = 5
        val result = solution.climbStairs(n)
        println(result) // 8
        val expected = 8
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val n = 6
        val result = solution.climbStairs(n)
        println(result) // 13
        val expected = 13
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseSix() {
        val solution = Solution()
        val n = 7
        val result = solution.climbStairs(n)
        println(result) // 21
        val expected = 21
        Assert.assertEquals(expected, result)
    }
}