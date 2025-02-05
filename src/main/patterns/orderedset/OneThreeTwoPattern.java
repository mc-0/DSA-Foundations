package main.patterns.orderedset;

import java.util.TreeSet;

// Time: O(NLogN)
// Space: O(N)
public class OneThreeTwoPattern {

    public static boolean find132pattern(int[] nums) {
        int z = Integer.MIN_VALUE;  // Initialize z to the smallest possible value
        TreeSet<Integer> set = new TreeSet<>();  // A TreeSet to keep elements in sorted order

        // Iterate through the array from end to start
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < z) return true;  // If current number is smaller than z, pattern is found

            // Find the largest element in the set which is smaller than the current number
            Integer n = set.lower(nums[i]);
            if (n != null) z = n;  // Update z to this element

            set.add(nums[i]);  // Add current number to the set for future comparisons
        }

        return false;  // Return false if no pattern is found
    }

}
