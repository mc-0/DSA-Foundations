package main.patterns.arrays_and_hashing;
//283. Move Zeroes
public class MoveZeros {

    /*
     * Two-pointers: i & j swap elements based on requirements. This problem is 0's moved to the end of array
     * If the current element at `i` is valid (not zero) we simply increment `i`
     * `j` scans for a valid non-zero element that can be placed at `i` when appropriate
     * Time: O(n)
     * Space: O(1)
     */
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;

        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] != 0) {
                i++;
            }
            else if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }

}
