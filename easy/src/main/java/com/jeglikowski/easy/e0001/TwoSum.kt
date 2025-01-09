package com.jeglikowski.easy.e0001

internal class Solution {
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
