package scratchpad;

import datastructures.linkedlists.ListNode;
import patterns.fastslowpointers.CyclicLinkedList;

public class PracticeClient {


    public static void main(String[] args) {
        ListNode<Integer> n1 = new ListNode<>(1);
        ListNode<Integer> n2 = new ListNode<>(2);
        ListNode<Integer> n3 = new ListNode<>(3);
        ListNode<Integer> n4 = new ListNode<>(4);
        ListNode<Integer> n5 = new ListNode<>(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;
        System.out.println(CyclicLinkedList.findCycle(n1));

    }

}
