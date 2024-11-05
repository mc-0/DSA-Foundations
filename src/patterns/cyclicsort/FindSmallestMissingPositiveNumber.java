package patterns.cyclicsort;

import util.Helper;

public class FindSmallestMissingPositiveNumber {

    public static int findNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
                Helper.swap(nums, i, nums[i] - 1);
            }
            else {
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                return k + 1;
            }
        }
        return nums.length + 1;
    }
}
