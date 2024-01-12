package patterns.cyclicsort;

import patterns.util.Helper;

public class FindDuplicateNumber {


    public static int findNum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {  // Check if the current element is in its correct position
                if (nums[i] != nums[nums[i] - 1])  // Check if there is a duplicate at the current position
                    Helper.swap(nums, i, nums[i] - 1);  // Swap elements to their correct positions
                else // We have found the duplicate
                    return nums[i]; // Return the duplicate number
            } else {
                i++; // Move to the next element
            }
        }

        return -1; // No duplicate found
    }

    public static int findNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentNum = nums[i];
            if (nums[currentNum - 1] != currentNum) {
                Helper.swap(nums, i, currentNum - 1);
            }
            else {
                i++;
            }
        }
        for (int k = 0; k < nums.length - 1; k++) {
            if (nums[k] == nums[k + 1]) {
                return nums[k];
            }
        }
        return -1;
    }
}
