package scratchpad;

import patterns.cyclicsort.FindAllMissingNumbers;
import patterns.cyclicsort.FindMissingNumber;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {

        int[] nums = {1, 3, 1, 8, 2, 3, 5, 1};
        System.out.println(Arrays.toString(nums));
        System.out.println(FindAllMissingNumbers.find(nums));
        System.out.println(Arrays.toString(nums));


    }

}
