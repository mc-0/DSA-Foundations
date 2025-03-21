package main.patterns.greedyalgorithms;

// Time: O()
// Space: O()
public class RemoveMinAndMaxFromArray {

    public static int minMoves(int[] nums) {
        int n = nums.length;
        int minIndex = 0, maxIndex = 0;

        // Find the indexes of the minimum and maximum elements
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) minIndex = i;
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }

        // Calculate distances from both ends
        int minDistStart = minIndex + 1;
        int minDistEnd = n - minIndex;
        int maxDistStart = maxIndex + 1;
        int maxDistEnd = n - maxIndex;

        // Determine the most efficient sequence
        int totalMoves = Math.min(
                Math.max(minDistStart, maxDistStart), // Both from start
                Math.min(
                        Math.min(minDistStart + maxDistEnd, minDistEnd + maxDistStart), // One from each end
                        Math.max(minDistEnd, maxDistEnd) // Both from end
                )
        );

        return totalMoves;
    }
}
