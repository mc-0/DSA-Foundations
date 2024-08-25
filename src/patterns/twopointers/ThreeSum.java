package patterns.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the input to effectively apply two pointers technique

        // Iterate through the array - set boundry to account for two pointers
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // initialize start & end pointers
            int j = i + 1;
            int k = nums.length - 1;

            // Apply two pointers technique
            while (j < k) {
                // Calculate sum of the three numbers
                int sum = nums[i] + nums[j] + nums[k];

                // if sum is zero...
                if (sum == 0) {
                    // add the three numbers to the result list
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    // skip duplicates for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // skip duplicates for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // move the pointers
                    j++;
                    k--;
                }
                else if (sum < 0) {
                    // if the sum is less than zero, move the start pointer
                    j++;
                }
                else {
                    // if the sum is greater than zero, move the end pointer
                    k--;
                }
            }
        }
        return result;
    }

}
