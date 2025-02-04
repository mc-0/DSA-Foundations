package patterns.monotonicstack;

import datastructures.linkedlists.ListNode;

import java.util.Stack;

public class RemoveNodeFromLinkedList {

    public static ListNode<Integer> removeNodes(ListNode<Integer> head) {
        Stack<ListNode> s = new Stack<>();
        ListNode current = head;

        while (current != null) {
            while (!s.isEmpty() && ((int) current.value > (int) s.peek().value)) {
                s.pop();
            }
            if (!s.isEmpty()) {
                s.peek().next = current;
            }
            s.push(current);
            current = current.next;
        }

        return s.isEmpty() ? null : s.get(0);
    }
}
