package solutions;/*You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

        Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

        You may assume that you have an infinite number of each kind of coin.

        */

/*
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]

Approach 1 -
Use a Stack.
while(head != null)
    stack.add(head)
    head = head.next;

while(head != null)
    lastElement = stack.pop
    head.next = lastElement
    lastElemnt = head.next

    break the loop - when its last element
    if(node !=null and node.next == lastElement)
        node.next = null
        break;


TC - O(N), SC - O(N)
 */

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReorderLinkedList {
    public void reorderList(DetectCycleInLinkedList.ListNode head) {



        if (head == null)
            return;

        Stack<DetectCycleInLinkedList.ListNode> stack = new Stack<>();

        DetectCycleInLinkedList.ListNode node = head;

        while(node != null)
        {
            stack.add(node);
            node = node.next;
        }

        node = head;

        while(node !=null)
        {
            DetectCycleInLinkedList.ListNode next = node.next;
            DetectCycleInLinkedList.ListNode endElement = stack.pop();

            node.next = endElement;
            endElement.next= next;

            node = next;

            //break the loop when the node points to last element
            if(node != null && node.next == endElement)
            {
                node.next = null;
                break;
            }

        }

    }
}