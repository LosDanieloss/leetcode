package com.jeglikowski.easy.e0013

import org.junit.Assert
import org.junit.Test

class RomanToIntegerTest {
    @Test
    fun useCaseOne() {
        val solution = Solution()
        val s = "III"
        val result = solution.romanToInt(s)
        println(result) // 3
        val expected = 3
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val s = "IV"
        val result = solution.romanToInt(s)
        println(result) // 4
        val expected = 4
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val s = "IX"
        val result = solution.romanToInt(s)
        println(result) // 9
        val expected = 9
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val s = "LVIII"
        val result = solution.romanToInt(s)
        println(result) // 58
        val expected = 58
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val s = "MCMXCIV"
        val result = solution.romanToInt(s)
        println(result) // 1994
        val expected = 1994
        Assert.assertEquals(expected, result)
    }
}