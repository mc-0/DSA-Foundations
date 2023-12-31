package patterns.fastslowpointers;

import datastructures.linkedlists.ListNode;

public class FindCycleStart {

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
