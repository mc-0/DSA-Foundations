package main.patterns.modifiedbinarysearch;

// Time: O(logN)
// Space: O(1)
public class BitonicArrayMaximum {

    public static int findMax(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > arr[middle + 1]) {
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }
        return arr[start];
    }

}
