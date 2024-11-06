package sorting;

import util.Helper;

public class DijkstraThreeWaySort {

    // This class should not be instantiated.
    private DijkstraThreeWaySort() {
    }

    /**
     * Sorts the array in ascending order using 3-way quicksort.
     * This algorithm is particularly efficient for arrays with many duplicate keys.
     * It partitions the array into three sections:
     * - Elements less than the pivot
     * - Elements equal to the pivot
     * - Elements greater than the pivot
     *
     * Time Complexity:
     * - Best and Average Case: O(N log N)
     * - Worst Case: O(N^2) (less likely due to initial shuffling)
     *
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        Helper.shuffle(a);  // Shuffle to avoid worst-case performance on sorted inputs
        sort(a, 0, a.length - 1);
        assert isSorted(a);  // Check if array is sorted (useful for debugging)
    }

    /**
     * Recursive 3-way quicksort on the subarray a[lo..hi].
     *
     * This method partitions the subarray into three sections:
     * - Elements less than the pivot value
     * - Elements equal to the pivot value
     * - Elements greater than the pivot value
     * Then, it recursively sorts the "less than" and "greater than" sections.
     *
     * Time Complexity for Each Recursive Call: O(N) due to single partitioning pass.
     * Overall Time Complexity (for entire array): O(N log N) in best/average case.
     *
     * @param a  the array to be sorted
     * @param lo the lower index of the subarray
     * @param hi the upper index of the subarray
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;  // Base case: single element or empty subarray

        int lt = lo, gt = hi;
        Comparable v = a[lo];  // Pivot chosen as first element
        int i = lo + 1;

        // Partitioning: arrange elements into three sections
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a, lt++, i++);   // Element is less than pivot
            else if (cmp > 0) exch(a, i, gt--); // Element is greater than pivot
            else i++;                          // Element is equal to pivot
        }

        // Recurse on the subarrays that are less than and greater than the pivot
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);

        assert isSorted(a, lo, hi);  // Check if subarray is sorted (useful for debugging)
    }

    /**
     * Helper function to compare two elements.
     *
     * @param v the first element
     * @param w the second element
     * @return true if v < w, false otherwise
     * Time Complexity: O(1) as it performs a single comparison
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param a the array containing elements to swap
     * @param i index of the first element
     * @param j index of the second element
     * Time Complexity: O(1) as it performs a single swap
     */
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    /**
     * Checks if the entire array is sorted in ascending order.
     * Useful for debugging to ensure correctness.
     *
     * @param a the array to check
     * @return true if the array is sorted, false otherwise
     * Time Complexity: O(N), where N is the number of elements in the array
     */
    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    /**
     * Checks if the subarray a[lo..hi] is sorted in ascending order.
     *
     * @param a  the array to check
     * @param lo the lower index of the subarray
     * @param hi the upper index of the subarray
     * @return true if the subarray is sorted, false otherwise
     * Time Complexity: O(N) for subarray length, where N is hi - lo + 1
     */
    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    /**
     * Prints the elements of the array to standard output.
     * Useful for debugging or visualizing the array content.
     *
     * @param a the array to print
     */
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
