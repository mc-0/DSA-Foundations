package scratchpad;

import datastructures.linkedlists.ListNode;
import patterns.cyclicsort.SimpleCyclicSort;
import patterns.fastslowpointers.FastSlowUtil;
import patterns.fastslowpointers.HappyNumber;
import patterns.fastslowpointers.PalindromeList;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {

        int[] x = {5,3,2,1,4};
        System.out.println(Arrays.toString(x));
        SimpleCyclicSort.sort(x);
        System.out.println(Arrays.toString(x));

    }

}
