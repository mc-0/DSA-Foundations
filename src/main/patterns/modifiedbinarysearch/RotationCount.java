package main.patterns.modifiedbinarysearch;

// Time: O(logN)
// Space: O(1)
public class RotationCount {

    public static int countRotations(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            // if mid is greater than the next element
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid + 1;

            // if mid is smaller than the previous element
            if (mid > start && nums[mid - 1] > nums[mid])
                return mid;

            if (nums[start] < nums[mid]) { // left side is sorted, so the pivot is on right side
                start = mid + 1;
            } else { // right side is sorted, so the pivot is on the left side
                end = mid - 1;
            }
        }

        return 0; // the array has not been rotated
    }
}
