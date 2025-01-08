package com.jeglikowski.easy.e0026

private class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 1

        for (i in nums.indices) {
            if (nums[i] != nums[k-1]) {
                nums[k++] = nums[i]
            }
        }

        return k
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(1, 1, 2)
    val result = solution.removeDuplicates(nums)
    println(result) // 2

    val nums2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val result2 = solution.removeDuplicates(nums2)
    println(result2) // 5
}