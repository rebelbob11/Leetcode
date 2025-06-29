/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

data class Node(var x: Int) {
    var next: ListNode? = null
}

class Solution {

    //Floyds tortoise hare algorithm
    fun hasCycle(head: ListNode?): Boolean {
        var slow: ListNode? = head
        var fast: ListNode? = head
        while (fast != null && fast?.next != null) {
            slow = slow?.next
            fast = fast?.next?.next

            if (slow == fast) {
                return true
            }
        }
        return false
    }

    //Hashmap technique
    fun hasCycle(head: ListNode?): Boolean {
        if (head?.next == null) return false

        val hashSet: HashSet<ListNode?> = hashSetOf()

        var current = head
        while (current?.next != null) {
            if (hashSet.contains(current)) {
                return true
            }
            hashSet.add(current)
            current = current?.next

        }
        return false
    }
}