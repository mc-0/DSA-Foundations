package main.patterns.modifiedbinarysearch;

public class AgnosticOrderSearch {

    // Time: O(logN)
    // Space: O(1)
    public static int binarySearch(int[] arr, int key) {
        if (arr == null) {
            return -1;
        }

        boolean isAscending = true;
        int start = 0, end = arr.length - 1;

        if (arr[end] < arr[start]) {
            isAscending = false;
        }

        while (start <= end) {
            int middle = (end + start) / 2;
            if (arr[middle] == key) {
                return middle;
            }

            if (isAscending) {
                if (arr[middle] > key) {
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }
            }
            else {
                if (arr[middle] > key) {
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
        }

        return -1;
    }


}
