package main.patterns.cyclicsort;

import main.util.Helper;

/*
268. Missing Number
Time: O(N)
Space: O(1)
*/
public class FindMissingNumber {

    public static int findMissingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentNum = nums[i];
            if (currentNum < nums.length && currentNum != nums[currentNum]){
                Helper.swap(nums, i, currentNum);
            }
            else {
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k) {
                return k;
            }
        }

        return nums.length;
    }
}
