package com.jeglikowski.easy.e0088

import org.junit.Assert
import org.junit.Test

class MergeSortedArraysTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val m = 3
        val nums2 = intArrayOf(2, 5, 6)
        val n = 3
        solution.merge(nums1, m, nums2, n)
        val result = nums1.toList()
        println(result) // [1, 2, 2, 3, 5, 6]
        val expected = listOf(1, 2, 2, 3, 5, 6)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseTwo() {
        val solution = Solution()
        val nums1 = intArrayOf(1)
        val m = 1
        val nums2 = intArrayOf()
        val n = 0
        solution.merge(nums1, m, nums2, n)
        val result = nums1.toList()
        println(result) // [1]
        val expected = listOf(1)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun useCaseThree() {
        val solution = Solution()
        val nums1 = intArrayOf(0)
        val m = 0
        val nums2 = intArrayOf(1)
        val n = 1
        solution.merge(nums1, m, nums2, n)
        val result = nums1.toList()
        println(result) // [1]
        val expected = listOf(1)
        Assert.assertEquals(expected, result)
    }
}