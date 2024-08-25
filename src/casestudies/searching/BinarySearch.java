package casestudies.searching;

public class BinarySearch {

    public static boolean verifyRecursively(int[] arr, int high, int low, int item) {
        if (low == high) {
            return arr[low] == item;
        } else {
            int mid = (low + high) / 2;
            if (arr[mid] == item) {
                return true;
            } else {
                if (item < arr[mid]) {
                    return verifyRecursively(arr, low, mid - 1, item);
                } else {
                    return verifyRecursively(arr, mid + 1, high, item);
                }
            }
        }
    }

    public static boolean verifyIteratively(int[] arr, int item){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (high + low) / 2;

            if (item == arr[mid]){
                return true;
            }
            else if (item < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
