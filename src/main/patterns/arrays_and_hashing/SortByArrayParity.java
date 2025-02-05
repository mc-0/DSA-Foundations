package main.patterns.arrays_and_hashing;
// 905. Sort By Array Parity
public class SortByArrayParity {

    /*
    * Two-pointers: i & j swap elements based on requirements. This problem is even numbers before odd
    * If the current element at `i` is valid (is even) we simply increment it
    * `j` scans for a valid element that can be placed at `i` when appropriate
    * Time: O(n)
    * Space: O(1)
    */
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length <= 1) return nums;

        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] % 2 == 0) {
                i++;
            }
            else if (nums[i] % 2 > 0 && nums[j] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
            j++;
        }
        return nums;
    }

}
