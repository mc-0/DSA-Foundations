package scratchpad;

import datastructures.linkedlists.ListNode;
import patterns.fastslowpointers.FastSlowUtil;
import patterns.fastslowpointers.HappyNumber;
import patterns.fastslowpointers.PalindromeList;

public class PracticeClient {

    public static void main(String[] args) {

        ListNode n1 = new ListNode<>(1);
        ListNode n2 = new ListNode<>(2);
        ListNode n3 = new ListNode<>(3);
        ListNode n4 = new ListNode<>(4);
        ListNode n5 = new ListNode<>(5);
        ListNode n6 = new ListNode<>(6);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

//        System.out.println(PalindromeList.checkIfListIsPalindrome(n6));

        FastSlowUtil.printList(n1);
        FastSlowUtil.reverse(n4);

//        n3.next = n6;
        FastSlowUtil.printList(n1);

    }

}
