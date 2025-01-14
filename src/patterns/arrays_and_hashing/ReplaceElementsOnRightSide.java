package patterns.arrays_and_hashing;
// 1299. Replace Elements with Greatest Element on Right Side
public class ReplaceElementsOnRightSide {
    /*
    * Start @ end of array and work to the front using an initial max of -1
    * inside the loop, copy the current value to update the max
    * Time: O(n)
    * Space: O(1)
    */
    public int[] replaceElements(int[] arr) {
        if (arr == null) return arr;

        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int maxCheck = arr[i];
            arr[i] = max;
            max = Math.max(max, maxCheck);
        }
        return arr;
    }
}
