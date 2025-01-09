package com.jeglikowski.easy.e0028

import org.junit.Assert
import org.junit.Test

class FindTheIndexOfTheFirstOccurrenceTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val haystack = "hello"
        val needle = "ll"
        val result = solution.strStr(haystack, needle)
        println(result) // 2
        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val haystack = "aaaaa"
        val needle = "bba"
        val result = solution.strStr(haystack, needle)
        println(result) // -1
        val expected = -1
        Assert.assertEquals(expected, result)
    }
}