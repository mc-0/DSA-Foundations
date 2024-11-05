package patterns.cyclicsort;

import util.Helper;

public class SimpleCyclicSort {

    public static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] != nums[j]) {
                Helper.swap(nums, i, j);
            }
            else {
                i++;
            }
        }
    }

    public static void bruteForceSort(int[] arr) {
        int current = 0;
        int scan = current;

        while (current < arr.length) {
            if (arr[scan] == current + 1) {
                int temp = arr[current];
                arr[current] = arr[scan];
                arr[scan] = temp;
                current++;
            }
            else {
                scan++;
            }
            if (scan >= arr.length) {
                scan = current;
            }
        }
    }

}
