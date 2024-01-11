package scratchpad;

import patterns.cyclicsort.FindMissingNumber;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {

        int[] nums = {8, 3, 5, 2, 4, 6, 0, 1};
        System.out.println(Arrays.toString(nums));
        System.out.println(FindMissingNumber.findMissingNumber(nums));
        System.out.println(Arrays.toString(nums));


    }

}
