package main.patterns.fastslowpointers;

import main.datastructures.linkedlists.ListNode;
/*
141. Linked List Cycle
Time: O(n)
Space: O(1)
*/
public class CyclicLinkedList {

    public static boolean findCycle(ListNode<Integer> head) {
        ListNode<Integer> fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
