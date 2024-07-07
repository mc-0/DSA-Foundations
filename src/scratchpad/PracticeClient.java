package scratchpad;

import blind75.arrays_and_hashing.TopKFrequentElements;
import blind75.arrays_and_hashing.ValidAnagram;
import blind75.twopointers.ThreeSum;
import patterns.orderedset.MyCalendarI;

import java.util.*;

public class PracticeClient {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum.solve(nums));
    }
}
