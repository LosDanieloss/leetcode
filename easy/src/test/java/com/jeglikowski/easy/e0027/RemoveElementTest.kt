package com.jeglikowski.easy.e0027

import org.junit.Assert
import org.junit.Test

class RemoveElementTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val nums = intArrayOf(3, 2, 2, 3)
        val result = solution.removeElement(nums, 3)
        println(result) // 2
        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val result = solution.removeElement(nums, 2)
        println(result) // 5
        val expected = 5
        Assert.assertEquals(expected, result)
    }
}