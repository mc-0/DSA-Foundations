package patterns.cyclicsort;

import static util.Helper.swap;

public class FindCorruptPair {

    public static int[] findPairs(int[] nums) {
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
                return new int[] {nums[k], k + 1};
            }
        }
        return new int[] { -1, -1 };
    }
}
