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

        //Hashmap technique
        //Time complexity O(m+n)
        //Space complexity O(m+n)
//        var hashSet: HashSet<ListNode?> = hashSetOf()
//        var current: ListNode? = headA
//
//        while (current != null) {
//            hashSet.add(current)
//            current = current?.next
//        }
//
//        current = headB
//        while (current != null) {
//            if (hashSet.contains(current)) {
//                return current
//            }
//            hashSet.add(current)
//            current = current?.next
//        }
//        return null

        //Two pointer technique
        //Time complexity O(m+n)
        //Space complexity O(1)

        var pointer1: ListNode? = headA
        var pointer2:ListNode? = headB

        while(pointer1 != pointer2) {
            pointer1 = if(pointer1 == null) headB else pointer1.next
            pointer2 = if(pointer2 == null) headA else pointer2.next
        }

        return pointer1
    }
}