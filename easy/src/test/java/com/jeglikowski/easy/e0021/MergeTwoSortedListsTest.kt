package com.jeglikowski.easy.e0021

import org.junit.Assert
import org.junit.Test

class MergeTwoSortedListsTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val l1 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(4)
            }
        }

        val l2 = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }

        var resultList = solution.mergeTwoLists(l1, l2)
        val result = mutableListOf<Int>()
        while (resultList != null) {
            result.add(resultList.`val`)
            resultList = resultList.next
        }
        val expected = listOf(1, 1, 2, 3, 4, 4)
        Assert.assertEquals(expected, result)
    }
}