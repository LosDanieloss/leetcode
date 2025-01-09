package com.jeglikowski.easy.e0058

import org.junit.Assert
import org.junit.Test

class LengthOfLastWordTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val s = "Hello World"
        val result = solution.lengthOfLastWord(s)
        println(result) // 5
        val expected = 5
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val s = "   fly me   to   the moon  "
        val result = solution.lengthOfLastWord(s)
        println(result) // 4
        val expected = 4
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val s = "luffy is still joyboy"
        val result = solution.lengthOfLastWord(s)
        println(result) // 6
        val expected = 6
        Assert.assertEquals(expected, result)
    }
}