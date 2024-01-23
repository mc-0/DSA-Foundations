package patterns.slidingwindow;

public class SmallestSubarrayWithGreaterSum {

    public static int findSum(int[] arr, int S) {
        int windowSum = 0, smallest = Integer.MAX_VALUE;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            while (windowSum >= S && windowStart <= windowEnd) {
                smallest = Math.min(smallest, windowEnd -  windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return smallest < Integer.MAX_VALUE ? smallest : 0;
    }
}
