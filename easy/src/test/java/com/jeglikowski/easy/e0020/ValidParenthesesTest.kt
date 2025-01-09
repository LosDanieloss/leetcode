package com.jeglikowski.easy.e0020

import org.junit.Assert
import org.junit.Test

class ValidParenthesesTest {
    @Test
    fun useCaseOne() {
        val solution = Solution()
        val s = "()"
        val result = solution.isValid(s)
        println(result) // true
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val s = "()[]{}"
        val result = solution.isValid(s)
        println(result) // true
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val s = "(]"
        val result = solution.isValid(s)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val s = "([)]"
        val result = solution.isValid(s)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val s = "{[]}"
        val result = solution.isValid(s)
        println(result) // true
        val expected = true
        Assert.assertEquals(expected, result)
    }
}