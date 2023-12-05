package scratchpad;

import patterns.twopointers.TwoPointers;

import java.util.Arrays;

public class PracticeClient {


    public static void main(String[] args) {
        int[] nums = {-2,-1,0,2,3};

        int[] r = TwoPointers.squareSortedArray(nums);
        System.out.println(Arrays.toString(r));
    }

}
