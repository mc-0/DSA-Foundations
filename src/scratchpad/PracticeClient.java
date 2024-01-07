package scratchpad;

import datastructures.linkedlists.ListNode;
import patterns.fastslowpointers.HappyNumber;
import patterns.fastslowpointers.PalindromeList;

public class PracticeClient {

    public static void main(String[] args) {

        ListNode n1 = new ListNode<>(2);
        ListNode n2 = new ListNode<>(4);
        ListNode n3 = new ListNode<>(6);
        ListNode n4 = new ListNode<>(6);
        ListNode n5 = new ListNode<>(4);
        ListNode n6 = new ListNode<>(2);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

//        System.out.println(PalindromeList.checkIfListIsPalindrome(n6));

        ListNode ln1 = new ListNode<>(1);
        ListNode ln2 = new ListNode<>(2);
        ln1.next = ln2;
        ln2.next = null;
        System.out.println(PalindromeList.checkIfListIsPalindrome(ln1));
    }

}
