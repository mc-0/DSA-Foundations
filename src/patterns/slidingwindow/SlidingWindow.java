package patterns.slidingwindow;

public class SlidingWindow {

    public int numIdenticalPairs(int[] nums) {
        int count = 0, start = 0;
        int end = start + 1;

        while (start < nums.length - 1) {
            if (start < end && nums[start] == nums[end]) {
                count++;
            }
            end++;
            if (end > nums.length - 1) {
                start++;
                end = start +1;
            }
        }
        return count;
    }
}
