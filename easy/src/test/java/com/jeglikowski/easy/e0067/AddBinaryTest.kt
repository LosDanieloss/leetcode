package com.jeglikowski.easy.e0067

import org.junit.Assert
import org.junit.Test

class AddBinaryTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val a = "11"
        val b = "1"
        val result = solution.addBinary(a, b)
        println(result) // 100
        val expected = "100"
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFive() {
        val solution = Solution()
        val a = "1010"
        val b = "1011"
        val result = solution.addBinary(a, b)
        println(result) // 10101
        val expected = "10101"
        Assert.assertEquals(expected, result)
    }
}