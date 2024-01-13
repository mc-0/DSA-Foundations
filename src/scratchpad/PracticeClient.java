package scratchpad;

import patterns.cyclicsort.*;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {

        int[] nums = {7,6,3,1,4,5};
        System.out.println(Arrays.toString(nums));
        System.out.println(FindSmallestMissingPositiveNumber.findNumber(nums));
        System.out.println(Arrays.toString(nums));


    }

}
