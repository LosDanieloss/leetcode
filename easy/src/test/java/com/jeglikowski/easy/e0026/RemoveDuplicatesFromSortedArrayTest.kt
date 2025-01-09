package com.jeglikowski.easy.e0026

import org.junit.Assert
import org.junit.Test

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val nums = intArrayOf(1, 1, 2)
        val result = solution.removeDuplicates(nums)
        println(result) // 2
        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val result = solution.removeDuplicates(nums)
        println(result) // 5
        val expected = 5
        Assert.assertEquals(expected, result)
    }
}