package sorting;

import sorting.util.Swapper;

public class SelectionSort {

    // Marks the current value as the minimum, which is updated if a lesser value is found.
    // At the end, swaps the initial minimum with the new compared minimum.
    // Runtime: O(n^2) Quadratic || Space: O(1) || Unstable Sort
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            Swapper.swap(a, i, smallest);
        }
    }


}
