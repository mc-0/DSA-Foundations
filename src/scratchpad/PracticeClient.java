package scratchpad;

import datastructures.linkedlists.ListNode;
import patterns.cyclicsort.SimpleCyclicSort;
import patterns.fastslowpointers.FastSlowUtil;
import patterns.fastslowpointers.HappyNumber;
import patterns.fastslowpointers.PalindromeList;
import patterns.mergeintervals.ConflictingAppointments;
import patterns.mergeintervals.IntersectIntervals;
import patterns.mergeintervals.Interval;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PracticeClient {

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 4, 7};
        System.out.println(Arrays.toString(nums));
        SimpleCyclicSort.sort(nums);
        System.out.println(Arrays.toString(nums));


    }

}
