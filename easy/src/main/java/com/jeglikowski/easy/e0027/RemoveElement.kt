package com.jeglikowski.easy.e0027

private class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val toRemove = `val`
        var k = 0

        for (i in nums.indices) {
            if (nums[i] != toRemove) {
                nums[k++] = nums[i]
            }
        }

        return k
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(3, 2, 2, 3)
    val result = solution.removeElement(nums, 3)
    println(result) // 2

    val nums2 = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val result2 = solution.removeElement(nums2, 2)
    println(result2) // 5
}