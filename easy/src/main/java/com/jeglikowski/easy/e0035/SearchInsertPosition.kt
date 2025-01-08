package com.jeglikowski.easy.e0035

private class Solution {
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

fun main() {
    val solution = Solution()
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 5
    val result = solution.searchInsert(nums, target)
    println(result) // 2

    val nums2 = intArrayOf(1, 3, 5, 6)
    val target2 = 2
    val result2 = solution.searchInsert(nums2, target2)
    println(result2) // 1

    val nums3 = intArrayOf(1, 3, 5, 6)
    val target3 = 7
    val result3 = solution.searchInsert(nums3, target3)
    println(result3) // 4

    val nums4 = intArrayOf(1, 3, 5, 6)
    val target4 = 0
    val result4 = solution.searchInsert(nums4, target4)
    println(result4) // 0
}