package patterns.modifiedbinarysearch;

public class FloorOfNumber {


    //Time: O(logN)
    //Space: O(1)
    public static int findFloor(int[] arr, int key) {
        if (arr == null || key < arr[0]) {
            return -1;
        }

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] > key) {
                end = middle - 1;
            }
            else if (arr[middle] < key){
                start = middle + 1;
            }
            else {
                return middle;
            }
        }

        return end;
    }

}
