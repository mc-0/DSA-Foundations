package main.patterns.fastslowpointers;

import main.datastructures.linkedlists.ListNode;

public class FastSlowUtil {

    public static ListNode reverse(ListNode head) {
        ListNode current = head, prev = null, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.value);
            head = head.next;
            if (head != null) {
                sb.append(" -> ");
            }
        }
        System.out.println(sb);
    }

}
