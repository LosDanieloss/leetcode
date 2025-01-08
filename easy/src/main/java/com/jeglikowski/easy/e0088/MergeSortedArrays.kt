package com.jeglikowski.easy.e0088

private class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (n == 0) {
            return
        }
        if (m == 0) {
            for (i in 0..(n - 1)) {
                nums1[i] = nums2[i]
            }
            return
        }
        val indexesCount = nums1.size - 1
        val tmpArray = IntArray(nums1.size)
        var nums1HeadIndex = 0
        var nums2HeadIndex = 0
        for (i in 0..indexesCount) {
            val nums1Head = if (nums1HeadIndex < m) { nums1[nums1HeadIndex] } else { null }
            val nums2Head = if (nums2HeadIndex < n) { nums2[nums2HeadIndex] } else { null }
            val toInsert = if(nums1Head == null) {
                nums2HeadIndex += 1
                nums2Head
            } else if (nums2Head == null) {
                nums1HeadIndex += 1
                nums1Head
            } else if (nums1Head <= nums2Head) {
                nums1HeadIndex += 1
                nums1Head
            } else {
                nums2HeadIndex += 1
                nums2Head
            }
            tmpArray[i] = toInsert!!
        }
        for (i in 0..indexesCount) {
            nums1[i] = tmpArray[i]
        }
    }
}

fun main() {
    val solution = Solution()
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val m = 3
    val nums2 = intArrayOf(2, 5, 6)
    val n = 3
    solution.merge(nums1, m, nums2, n)
    println(nums1.toList()) // [1, 2, 2, 3, 5, 6]

    val nums3 = intArrayOf(1)
    val m2 = 1
    val nums4 = intArrayOf()
    val n2 = 0
    solution.merge(nums3, m2, nums4, n2)
    println(nums3.toList()) // [1]

    val nums5 = intArrayOf(0)
    val m3 = 0
    val nums6 = intArrayOf(1)
    val n3 = 1
    solution.merge(nums5, m3, nums6, n3)
    println(nums5.toList()) // [1]
}