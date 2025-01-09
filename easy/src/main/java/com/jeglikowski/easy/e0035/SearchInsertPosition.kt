package com.jeglikowski.easy.e0035

internal class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums[0] > target) {
            return 0
        }
        if (nums[nums.size - 1] < target) {
            return nums.size
        }
        var rangeStart = 0
        var rangeEnd = nums.size - 1
        while (rangeStart != rangeEnd) {
            val numsStart = nums[rangeStart]
            if (numsStart == target) {
                return rangeStart
            }
            if (numsStart > target) {
                return rangeStart
            }

            val numsEnd = nums[rangeEnd]
            if (numsEnd == target) {
                return rangeEnd
            }
            if (numsEnd < target) {
                return rangeEnd + 1
            }

            val rangeHalf = rangeStart + ((rangeEnd - rangeStart) / 2)
            val numsHalf = nums[rangeHalf]
            if (numsHalf == target) {
                return rangeHalf
            }

            if (rangeStart == rangeHalf) {
                if (numsHalf < target) {
                    return rangeEnd
                } else {
                    return rangeStart
                }
            }

            if (numsHalf < target) {
                rangeStart = rangeHalf
            } else if (numsHalf > target) {
                rangeEnd = rangeHalf
            }
        }
        return rangeStart
    }
}
