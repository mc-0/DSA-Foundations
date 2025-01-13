package patterns.arrays_and_hashing;
// 27. Remove Element
public class RemoveElement {
    /*
    * Uses an `i` to keep track of elements that don't equal `val`
    * Prevents unnecessary copies when shifting elements (i.e., when val doesn't occur often / is rare)
    * Checks for when overwriting an element with the same value (`val`)
    */
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            }
            else {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
