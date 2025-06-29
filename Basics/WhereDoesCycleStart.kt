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
    fun detectCycle(head: ListNode?): ListNode? {
        //Floyds tortoise hare algorithm

        var slow: ListNode? = head
        var fast: ListNode? = head
        while(fast != null && fast?.next != null) {
            slow = slow?.next
            fast = fast?.next?.next

            // when two pointers meet, it tells that a cycle is detected
            // the start and slow pointers go at the same pace and where
            // they meet next gives the start of the cycle

            if(slow == fast) {
                var cycleStart: ListNode? = head
                while(cycleStart != slow) {
                    cycleStart = cycleStart?.next
                    slow = slow?.next
                }
                return cycleStart
            }
        }
        return null
    }
}