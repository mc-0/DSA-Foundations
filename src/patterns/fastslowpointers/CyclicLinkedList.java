package patterns.fastslowpointers;

import datastructures.linkedlists.ListNode;
import datastructures.linkedlists.SinglyLinkedList;

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
