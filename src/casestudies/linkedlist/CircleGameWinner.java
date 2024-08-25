package casestudies.linkedlist;

import datastructures.linkedlists.ListNode;
// 1823. Find the Winner of the Circular Game
public class CircleGameWinner {
    public static int solve(int n, int k) {
        if (n <= 1 || k == 0) {
            return n;
        }
        int popK = k;
        // create circular linked list
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new ListNode<>(i);
            current = current.next;
        }

        // make the linked list circular
        current.next = head;

        // remove every kth node until only one node is left
        while (current.next != current) {
            popK = k;
            while (--popK > 0) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        return current.value;


    }
}
