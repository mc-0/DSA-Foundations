package main.patterns.fastslowpointers;

import main.datastructures.linkedlists.ListNode;
/*
876. Middle of the Linked List
Time: O(n)
Space: O(1)
*/
public class MiddleLinkedList {

    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
