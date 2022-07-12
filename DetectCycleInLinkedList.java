/**
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 **/


/*Approach 1 -
    empty Set<Integer>
    while (head!= null)
        if set.contains(node)
        return true

    return false

    TC = O(N) Space complexity -O(N)


    Approach 2 -
    2 pointer - fast and slow
    1 -> 2 -> 4 -> 5
    slow
        fast


*/

public class Solution {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public boolean hasCycle(ListNode head) {

        if(head == null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast)
        {
            if(fast == null || fast.next == null )
                return false;

            slow = slow.next;
            fast = fast.next.next;

        }

        return true;
    }
}