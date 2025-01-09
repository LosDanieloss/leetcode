package com.jeglikowski.easy.e0088

internal class Solution {
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
