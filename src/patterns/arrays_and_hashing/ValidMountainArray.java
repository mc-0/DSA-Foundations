package patterns.arrays_and_hashing;
// 941. Valid Mountain Array
public class ValidMountainArray {

    /*
    * Two passes count the increasing steps & decreasing steps.
    * A valid mountain will be made up of the number of valid step equal to length of the array - 1
    * After counting steps up: check to see if your at the base of the mountain on either side
    * Time: O(n)
    * Space: O(1)
    */
    public boolean validMountainArray(int[] arr) {
        int n = arr.length, i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1]) i++;

        if (i == 0 || i == n - 1) return false;

        while (i + 1 < n && arr[i] > arr[i + 1]) i++;

        return i == n - 1;

    }

}
