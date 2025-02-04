package patterns.fastslowpointers;

import datastructures.linkedlists.ListNode;

public class PalindromeList {

    public static boolean checkIfListIsPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = reverseMiddleOfList(slow);

        ListNode start = head;

        while (mid != null) {
            System.out.println("START: " + start.value + " || MID: " + mid.value);
            if (start.value != mid.value) {
                return false;
            }
            start = start.next;
            mid = mid.next;
        }

        reverseMiddleOfList(mid);

        return true;
    }

    public static ListNode reverseMiddleOfList(ListNode head) {
        ListNode current = head, prev = null, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }



}
