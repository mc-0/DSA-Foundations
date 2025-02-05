package main.patterns.fastslowpointers;

import main.datastructures.linkedlists.ListNode;

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
