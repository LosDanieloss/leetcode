package com.jeglikowski.easy.e0021

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

internal class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

internal class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }

        var head: ListNode? = null
        var currentHead: ListNode? = null
        var tmpL1 = list1
        var tmpL2 = list2

        while (tmpL1 != null || tmpL2 != null) {
            if (tmpL1 == null) {
                if (currentHead == null) {
                    currentHead = tmpL2
                } else {
                    currentHead.next = tmpL2
                    currentHead = currentHead.next
                }
                tmpL2 = tmpL2?.next
                if (head == null) {
                    head = currentHead
                }
                continue
            }
            if (tmpL2 == null) {
                if (currentHead == null) {
                    currentHead = tmpL1
                } else {
                    currentHead.next = tmpL1
                    currentHead = currentHead.next
                }
                tmpL1 = tmpL1.next
                if (head == null) {
                    head = currentHead
                }
                continue
            }
            if (tmpL1.`val` < tmpL2.`val`) {
                if (currentHead == null) {
                    currentHead = tmpL1
                } else {
                    currentHead.next = tmpL1
                    currentHead = currentHead?.next
                }
                tmpL1 = tmpL1.next
            } else {
                if (currentHead == null) {
                    currentHead = tmpL2
                } else {
                    currentHead.next = tmpL2
                    currentHead = currentHead.next
                }
                tmpL2 = tmpL2.next
            }
            if (head == null) {
                head = currentHead
            }
        }
        return head
    }
}
