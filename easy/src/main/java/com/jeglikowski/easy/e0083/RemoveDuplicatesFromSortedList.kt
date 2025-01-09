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
internal class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

internal class Solution {
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
