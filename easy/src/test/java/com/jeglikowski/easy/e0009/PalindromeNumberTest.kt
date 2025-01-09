package com.jeglikowski.easy.e0009

import org.junit.Assert
import org.junit.Test

class PalindromeNumberTest {
    @Test
    fun useCaseOne() {
        val solution = Solution()
        val x = 121
        val result = solution.isPalindrome(x)
        println(result) // true
        val expected = true
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val x = -121
        val result = solution.isPalindrome(x)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val x = 10
        val result = solution.isPalindrome(x)
        println(result) // false
        val expected = false
        Assert.assertEquals(expected, result)
    }
}