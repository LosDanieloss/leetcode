package com.jeglikowski.easy.e0083

import org.junit.Assert
import org.junit.Test

class RemoveDuplicatesFromSortedListTest {

    @Test
    fun useCaseOne() {
        val solution = Solution()
        val head = ListNode(1)
        head.next = ListNode(1)
        head.next!!.next = ListNode(2)
        var resultList = solution.deleteDuplicates(head)

        val result = mutableListOf<Int>()
        while (resultList != null) {
            result.add(resultList.`val`)
            print(resultList.`val`)
            print(" ")
            resultList = resultList.next
        } // 1 2
        val expected = listOf(1, 2)
        Assert.assertEquals(expected, result)
    }
}