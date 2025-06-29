/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

// class ListNode(var `val`: Int) {
//     var next: ListNode? = null
// }

class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var hashSet: HashSet<ListNode?> = hashSetOf()
        var current: ListNode? = headA

        while (current != null) {
            hashSet.add(current)
            current = current?.next
        }

        current = headB
        while (current != null) {
            if (hashSet.contains(current)) {
                return current
            }
            hashSet.add(current)
            current = current?.next
        }
        return null
    }
}