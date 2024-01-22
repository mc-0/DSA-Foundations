package patterns.slidingwindow;

public class MaxSumOfSubArraySizeK {

    // Time: O(n)
    // Space: O(1)
    public static int getMaxSum(int[] nums, int k) {
        int windowStart = 0;
        int maxSum = 0, windowSum = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            if (windowEnd - windowStart == k - 1) {
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
