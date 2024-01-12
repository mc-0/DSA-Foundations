package scratchpad;

import patterns.cyclicsort.FindAllDuplicateNumbers;
import patterns.cyclicsort.FindAllMissingNumbers;
import patterns.cyclicsort.FindDuplicateNumber;
import patterns.cyclicsort.FindMissingNumber;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {

        int[] nums = {3, 4, 4, 5, 5};
        System.out.println(Arrays.toString(nums));
        System.out.println(FindAllDuplicateNumbers.findNumbers(nums));
        System.out.println(Arrays.toString(nums));


    }

}
