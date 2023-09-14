package sorting;
// Divide & Conquer - Typically done recursively
// Time: O(n log n)
// Space: O(n)

import java.util.Arrays;

public class MergeSort {


    public static void resursiveSort(int[] arr, int[] temp, int leftStart, int rightEnd){


    }

    public static void recursiveMerge(int[] arr, int[] temp, int leftStart, int rightEnd) {

    }


    public static void iterativeSort(int[]a){
        int n = a.length;
        for (int len = 1; len < n; len *= 2) {
            for (int lo = 0; lo < n - len; lo += len + len) {
                iterativeMerge(a, lo, lo + len - 1, Math.min(lo + len +len - 1, n - 1));
            }
        }
    }


    public static void iterativeMerge(int[] a, int lo, int mid, int hi) {
        int[] aux = new int[a.length];

        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        System.out.println(Arrays.toString(aux));

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            }
            else if (j > hi) {
                a[k] = aux[i++];
            }
            else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
            }
            else {
                a[k] = aux[i++];
            }
        }
    }


}
