package scratchpad;

import blind75.arrays_and_hashing.TopKFrequentElements;
import blind75.arrays_and_hashing.ValidAnagram;
import blind75.twopointers.ThreeSum;
import datastructures.linkedlists.ListNode;
import patterns.orderedset.MyCalendarI;

import java.util.*;

public class PracticeClient {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum.solve(nums));
    }

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
