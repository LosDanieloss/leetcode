package com.jeglikowski.easy.e0035

import org.junit.Assert
import org.junit.Test

class SearchInsertPositionTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        val result = solution.searchInsert(nums, target)
        println(result) // 2
        val expected = 2
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        val result = solution.searchInsert(nums, target)
        println(result) // 1
        val expected = 1
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        val result = solution.searchInsert(nums, target)
        println(result) // 4
        val expected = 4
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseFour() {
        val solution = Solution()
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 0
        val result = solution.searchInsert(nums, target)
        println(result) // 0
        val expected = 0
        Assert.assertEquals(expected, result)
    }
}