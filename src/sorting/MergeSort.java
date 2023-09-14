package sorting;
// Divide & Conquer - Typically done recursively
// Time: O(n log n)
// Space: O(n)

public class MergeSort {

    public static final String RECURSIVE = "TOP DOWN";
    public static final String ITERATIVE = "BOTTOM UP";

    public static void sort(int[] collection, String mergeType) {
        if (mergeType.equalsIgnoreCase(RECURSIVE)) {
            System.out.println("Sorting Collection with a Top Down / Recursive Merge Sort");
            recursive(collection, 0, collection.length - 1);
        }
        else if (mergeType.equalsIgnoreCase(ITERATIVE)) {
            System.out.println("Sorting Collection with a Bottom Up / Iterative Merge Sort");
            iterativeSort(collection);
        }
        else {
            System.out.println("Please select a merge sort implementation");
        }
    }

    public static void recursive(int[] a, int lo, int hi){
        if (hi <= lo) return;

        int mid = lo + (hi - lo) / 2;

        recursive(a, lo, mid);
        recursive(a, mid + 1, hi);
        merge(a, lo, mid, hi);

    }



    public static void iterativeSort(int[]a){
        int n = a.length;
        for (int len = 1; len < n; len *= 2) {
            for (int lo = 0; lo < n - len; lo += len + len) {
                merge(a, lo, lo + len - 1, Math.min(lo + len +len - 1, n - 1));
            }
        }
    }


    public static void merge(int[] a, int lo, int mid, int hi) {
        int[] aux = new int[a.length];

        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

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
