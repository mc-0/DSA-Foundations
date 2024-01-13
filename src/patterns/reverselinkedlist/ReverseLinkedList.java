package patterns.reverselinkedlist;

import datastructures.linkedlists.ListNode;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode current = head, next = null, prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
