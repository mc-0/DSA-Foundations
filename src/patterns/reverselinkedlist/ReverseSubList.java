package patterns.reverselinkedlist;

import datastructures.linkedlists.ListNode;

import static patterns.reverselinkedlist.ReverseLinkedList.reverseList;

public class ReverseSubList {

    public static ListNode reverse(ListNode head, int p, int q) {
        if (p == q) {
            return head;
        }

        ListNode current = head, previous = null;
        // Find the sublist & remember the node just before it
        for (int i = 0; current != null && i < p - 1; i++) {
            previous = current;
            current = current.next;
        }

        ListNode lastNodeBeforeSubList = previous;
        ListNode lastNodeOfSublist = current;
        ListNode next = null;

        for (int i = 0; current != null && i < q - p + 1; i++) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        // connect with the first part
        if (lastNodeBeforeSubList != null)
            // 'previous' is now the first node of the sub-list
            lastNodeBeforeSubList.next = previous;
        else
            // this means p == 1 i.e., we are changing the first node (head) of the LinkedList
            head = previous;

        // connect with the last part
        lastNodeOfSublist.next = current;

        return head;

    }
}
