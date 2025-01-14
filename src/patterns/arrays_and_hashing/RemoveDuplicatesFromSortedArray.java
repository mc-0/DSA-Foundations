package patterns.arrays_and_hashing;
// 26. Remove Duplicates From Sorted Array
public class RemoveDuplicatesFromSortedArray {
    /*
    * Starts 2 pointers from the 1st index. `insert` tracks index which can be updated as its a dupe
    * `i` scans the array making compares for duplicates
    * Time: O(n)
    * Space: O(1)
    */
    
    public int removeDuplicates(int[] nums) {
        int insert = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insert] = nums[i];
                insert++;
            }
        }
        return insert;
    }


}
