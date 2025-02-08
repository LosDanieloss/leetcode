package com.jeglikowski.easy.e108

import com.jeglikowski.easy.e0100.TreeNode
import kotlin.math.min
import java.util.Stack
import kotlin.math.max

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

internal class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        val numsList = nums.toList()
        return sortedArrayToBSTIterative(numsList)
    }

    fun sortedArrayToBSTIterative(nums: List<Int>): TreeNode? {
        if (nums.size == 1) return TreeNode(nums[0])

        val queue = Stack<List<Int>>().apply {
            add(nums)
        }
        val map = nums.associateWith { TreeNode(it) }
        while (queue.isNotEmpty()) {
            val qList = queue.removeAt(0)
            if (qList.size == 1) continue
            val index = qList.size / 2
            val node = map[qList[index]]

            val leftIndex = index / 2
            val rightIndex = min(qList.size - 1, index + (qList.size - index + 1) / 2)
            val leftNode = map[qList[leftIndex]]
            val rightNode = map[qList[rightIndex]]
            node?.apply {
                left = if (node != leftNode) leftNode else null
                right = if (node != rightNode) rightNode else null
            }

            val leftList = qList.subList(0, index)
            val rightStartIndex = min(index + 1, qList.size)
            val rightList = qList.subList(rightStartIndex, qList.size)

            if (leftList.isNotEmpty()) queue.add(leftList)
            if (rightList.isNotEmpty()) queue.add(rightList)
        }

        val rootIndex = nums.size / 2
        val root = map[nums[rootIndex]]
        return root
    }

    fun sortedArrayToBST(nums: List<Int>): TreeNode? {
        if (nums.size == 1) return TreeNode(nums[0])

        val rootIndex = nums.size / 2
        val root = TreeNode(nums[rootIndex])

        val leftList = nums.subList(0, rootIndex)
        val rightStartIndex = min(rootIndex + 1, nums.size)
        val rightList = nums.subList(rightStartIndex, nums.size)

        return root.apply {
            left = if (leftList.isEmpty()) null else sortedArrayToBST(leftList)
            right = if (rightList.isEmpty()) null else sortedArrayToBST(rightList)
        }
    }
}
