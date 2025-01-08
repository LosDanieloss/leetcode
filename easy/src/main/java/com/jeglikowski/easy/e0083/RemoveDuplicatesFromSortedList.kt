package com.jeglikowski.easy.e0083

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
private class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

private class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        var lastUniqueNode = head
        var tmpHead = head
        while (tmpHead?.next != null) {
            tmpHead = tmpHead.next
            if (lastUniqueNode?.`val` != tmpHead?.`val`) {
                lastUniqueNode?.next = tmpHead
                lastUniqueNode = tmpHead
            }
        }
        lastUniqueNode?.next = null
        return head
    }
}

fun main() {
    val solution = Solution()
    val head = ListNode(1)
    head.next = ListNode(1)
    head.next!!.next = ListNode(2)
    var result = solution.deleteDuplicates(head)

    while (result != null) {
        print(result.`val`)
        print(" ")
        result = result.next
    } // 1 2
}