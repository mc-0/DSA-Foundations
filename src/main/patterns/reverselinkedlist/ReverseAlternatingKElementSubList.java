package main.patterns.reverselinkedlist;

import main.datastructures.linkedlists.ListNode;

// Time: O(n)
// Space: O(1)
public class ReverseAlternatingKElementSubList {
    public static ListNode reverse(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode current = head, previous = null;
        while (true) {
            ListNode lastNodeOfPrevPart = previous;
            ListNode lastNodeOfSubList = current;
            ListNode next = null;


            for (int i = 0; i < k && current != null; i++) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            if (lastNodeOfPrevPart != null) {
                lastNodeOfPrevPart.next = previous;
            }

            else {
                head = previous;
            }

            lastNodeOfSubList.next = current;

            if (current == null) {
                break;
            }

            previous = lastNodeOfSubList;
            int skip = k;
            while (skip > 0 && current.next != null) {
                previous = current;
                current = current.next;
                skip--;
            }
        }

        return head;
    }
}
