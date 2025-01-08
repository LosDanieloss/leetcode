package com.jeglikowski.easy.e0001

private class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val pairs = nums.mapIndexed { index, number ->
            Pair(number, index)
        }.toMap()
        for (index in nums.indices) {
            val number = nums[index]
            val y = target - number
            val maybeYIndex = pairs[y]
            if (maybeYIndex != null && index != maybeYIndex) {
                return intArrayOf(index, maybeYIndex)
            }
        }
        return intArrayOf()
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = solution.twoSum(nums, target)
    println(result.joinToString()) // 0, 1

    val nums2 = intArrayOf(3, 2, 4)
    val target2 = 6
    val result2 = solution.twoSum(nums2, target2)
    println(result2.joinToString()) // 1, 2
}