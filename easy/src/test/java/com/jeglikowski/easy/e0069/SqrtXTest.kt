package com.jeglikowski.easy.e0069

import org.junit.Assert
import org.junit.Test

class SqrtXTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val x = 4
        val result = solution.mySqrt(x)
        println(result) // 2
        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val x = 8
        val result = solution.mySqrt(x)
        println(result) // 2
        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val x = 9
        val result = solution.mySqrt(x)
        println(result) // 3
        val expected = 3
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val x = 16
        val result = solution.mySqrt(x)
        println(result) // 4
        val expected = 4
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val x = 2147395599
        val result = solution.mySqrt(x)
        println(result) // 46339
        val expected = 46339
        Assert.assertEquals(expected, result)
    }
}