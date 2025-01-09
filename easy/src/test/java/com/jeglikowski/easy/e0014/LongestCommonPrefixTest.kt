package com.jeglikowski.easy.e0014

import org.junit.Assert
import org.junit.Test

class LongestCommonPrefixTest {
    @Test
    fun useCaseOne() {
        val solution = Solution()
        val strs = arrayOf("flower", "flow", "flight")
        val result = solution.longestCommonPrefix(strs)
        println(result) // fl
        val expected = "fl"
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val strs = arrayOf("dog", "racecar", "car")
        val result = solution.longestCommonPrefix(strs)
        println(result) // ""
        val expected = ""
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val strs = arrayOf("ab", "a")
        val result = solution.longestCommonPrefix(strs)
        println(result) // a
        val expected = "a"
        Assert.assertEquals(expected, result)
    }
}