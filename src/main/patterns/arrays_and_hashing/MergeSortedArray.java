package main.patterns.arrays_and_hashing;

import java.util.Arrays;
// 88. Merge Sorted Array
public class MergeSortedArray {

    /*
    * Uses 3 pointers while working backward from the end of the arrays
    * `p1` & `p2` track the indices in nums1 & nums2 respectively to compare elements
    * `end` tracks the index in nums1 in where the next element should be merged
    * Time: O(m + n)
    * Space: O(1)
    */

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for (int end = m + n - 1; end >= 0; end--) {
            if (p2 < 0) break; // all the elements have already been merged / nothing to merge from nums2

            // if there are still elements in nums1 to compare && the next element is greater than the next in nums2
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[end] = nums1[p1--];
            }
            else {
                nums1[end] = nums2[p2--];
            }
        }

    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

}
