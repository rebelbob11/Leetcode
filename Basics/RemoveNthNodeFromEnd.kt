/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}

/**
 * Explanation
 * Here two pointer method is being used and one pointer starts with a delay of n steps
 * The first pointer called current advances through the list n steps
 * The next pointer called nodeBeforeToRemove starts at head when first pointer reaches n steps
 * Now both the pointers advance through the list until current pointer reaches the End
 * Looking at the steps moved, current pointer moved L(Length of the list) steps and nodeBeforeToRemove
 * moved L-n steps
 * The second pointer that started at head when current pointer moved n steps, now is stopped after L-n steps
 * on the node thats right before the node that needs to be removed, hence called nodeBeforeToRemove
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

        val dummy = ListNode(0)
        dummy.next = head

        var first: ListNode? = dummy
        var second: ListNode? = dummy

        // Move `first` n+1 steps ahead
        for (i in 0..n) {
            first = first?.next
        }


        // Move both pointers until `first` reaches the end
        while (first != null) {
            first = first.next
            second = second?.next
        }

        // Remove the nth node from the end
        second?.next = second?.next?.next

        return dummy.next
    }
}