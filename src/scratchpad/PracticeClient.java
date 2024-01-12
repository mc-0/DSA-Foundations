package scratchpad;

import patterns.cyclicsort.FindAllMissingNumbers;
import patterns.cyclicsort.FindDuplicateNumber;
import patterns.cyclicsort.FindMissingNumber;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};
        System.out.println(Arrays.toString(nums));
        System.out.println(FindDuplicateNumber.findNumber(nums));
        System.out.println(Arrays.toString(nums));


    }

}
