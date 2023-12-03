package scratchpad;

import patterns.twopointers.TwoPointers;

import java.util.Arrays;

public class PracticeClient {


    public static void main(String[] args) {
        int[] nums = {2,5,9,11};

        int[] r = TwoPointers.targetSum(nums, 11);
        System.out.println(Arrays.toString(r));
    }

}
