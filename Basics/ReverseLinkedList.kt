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
    fun reverseList(head: ListNode?): ListNode? {
        //take the next node make it head
        //do it until end of the list

        fun reverseList(head: ListNode?): ListNode? {

            var currentHead = head
            while( head?.next != null) {
                var temp = head?.next
                head?.next = temp?.next
                temp?.next = currentHead
                currentHead = temp
            }

            return currentHead
        }
    }
}