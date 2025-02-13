package main.patterns.fastslowpointers;

import main.datastructures.linkedlists.ListNode;
/*
143. Reorder List
Time: O(n)
Space: O(1)
*/
public class RearrangeLinkedList {

    public static ListNode rearrangeLinkedList(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = FastSlowUtil.reverse(slow);
        ListNode temp = null;
        while (firstHalf != null && secondHalf != null) {
            temp = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = temp;

            temp = secondHalf.next;
            secondHalf.next = firstHalf;
            secondHalf = temp;
        }

        if (firstHalf != null) {
            firstHalf.next = null;
        }

        return head;

    }

}
