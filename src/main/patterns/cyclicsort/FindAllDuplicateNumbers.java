package main.patterns.cyclicsort;

import java.util.ArrayList;
import java.util.List;

import static main.util.Helper.swap;

/*
442. Find All Duplicates in an Array
Time: O(N)
Space: O(1)
*/
public class FindAllDuplicateNumbers {

    public static List<Integer> findNumbers(int[] nums) {
        List<Integer> duplicateNumbers = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
            else {
                i++;
            }

        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                duplicateNumbers.add(nums[k]);
            }
        }
        return duplicateNumbers;
    }
}
