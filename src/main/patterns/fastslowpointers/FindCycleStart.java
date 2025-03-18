package main.patterns.fastslowpointers;

import main.datastructures.linkedlists.ListNode;
/*
142. Linked List Cycle II
Time: O(n)
Space: O(1)
*/
public class FindCycleStart {

    public ListNode detectCycle(ListNode head) {
        return findCycleStart(head);
    }

    public static ListNode findCycleStart(ListNode head) {
        ListNode slow = head, fast = head;
        int cycleCount = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycleCount = findCycleCount(slow);
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        return findStart(head, cycleCount);
    }

    private static ListNode findStart(ListNode head, int cycleCount) {
        ListNode slow = head, fast = head;

        while (cycleCount > 0) {
            fast = fast.next;
            cycleCount--;
        }

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    private static int findCycleCount(ListNode slow) {
        ListNode current = slow;
        int cycleCount = 0;
        do {
            current = current.next;
            cycleCount++;
        } while (current != slow);
        return cycleCount;
    }


}
