package com.andrewhossam.leetcode

// 876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(
    var `val`: Int,
) {
    var next: ListNode? = null

    override fun toString(): String = "$`val`"
}

class `876-middle-of-the-linked-list` {
    fun middleNode(head: ListNode?): ListNode {
        val list = mutableListOf<ListNode>()
        var current = head
        while (current?.`val` != null) {
            list.add(current)
            current = current.next
        }
        return list[list.size / 2]
    }

    fun middleNode2(head: ListNode?): ListNode? {
        var middle = head
        var middleIndex = 0
        var current = head
        var currentIndex = 0
        while (current?.next != null) {
            current = current.next
            currentIndex++
            // if (currentIndex / 2 + 1) {
            middleIndex = currentIndex / 2
            middle = current
            // }
        }
        return middle
    }

    fun main() {
        println(
            middleNode(
                ListNode(1).also {
                    it.next =
                        ListNode(
                            2,
                        ).also {
                            it.next =
                                ListNode(
                                    3,
                                ).also {
                                    it.next =
                                        ListNode(
                                            4,
                                        ).also {
                                            it.next =
                                                ListNode(
                                                    5,
                                                )
                                        }
                                }
                        }
                },
            ),
        )
    }
}
