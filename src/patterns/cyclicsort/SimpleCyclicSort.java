package patterns.cyclicsort;

public class SimpleCyclicSort {

    public static void sort(int[] arr) {
        int current = 0;
        int scan = current;

        while (current < arr.length) {
            if (arr[scan] == current + 1) {
                int temp = arr[current];
                arr[current] = arr[scan];
                arr[scan] = temp;
                current++;
            }
            else {
                scan++;
            }
            if (scan >= arr.length) {
                scan = current;
            }
        }
    }

}
