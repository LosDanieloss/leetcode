package com.jeglikowski.easy.e0027

internal class Solution {
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
