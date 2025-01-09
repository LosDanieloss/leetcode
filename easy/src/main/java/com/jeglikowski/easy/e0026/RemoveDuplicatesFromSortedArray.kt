package com.jeglikowski.easy.e0026

internal class Solution {
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
