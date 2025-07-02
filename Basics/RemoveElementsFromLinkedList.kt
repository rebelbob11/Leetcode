/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {

        // Use a sentinel node at the start to simplify removing elements at head and tail

        var sentinelNode = ListNode(0)
        sentinelNode?.next = head

        var current = head
        var prev = sentinelNode

        while (current != null) {
            if (current.`val` == `val`) {
                prev?.next = current?.next
            } else {
                prev = current
            }
            current = current?.next
        }
        return sentinelNode?.next
    }
}