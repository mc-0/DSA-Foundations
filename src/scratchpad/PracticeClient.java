package scratchpad;

import patterns.cyclicsort.FindAllMissingNumbers;
import patterns.cyclicsort.FindDuplicateNumber;
import patterns.cyclicsort.FindMissingNumber;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {

        int[] nums = {2,1,3,3,5,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(FindDuplicateNumber.findNumber(nums));
        System.out.println(Arrays.toString(nums));


    }

}
