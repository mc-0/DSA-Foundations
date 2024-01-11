package patterns.cyclicsort;

import patterns.util.Helper;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {

    // Time: O(N)
    // Space: O(1)
    public static List<Integer> find(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int currentNum = nums[i];
            if(nums[currentNum - 1] != currentNum) {
                Helper.swap(nums, i, currentNum - 1);
            }
            else {
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                missingNumbers.add(k + 1);
            }
        }
        return missingNumbers;
    }
}
