package com.jeglikowski.easy.e0001

import org.junit.Assert
import org.junit.Test

class TwoSumTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = solution.twoSum(nums, target).toList()
        println(result.joinToString()) // 0, 1
        val expected = listOf(0, 1)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val result = solution.twoSum(nums, target).toList()
        println(result.joinToString()) // 0, 1
        val expected = listOf(1, 2)
        Assert.assertEquals(expected, result)
    }
}