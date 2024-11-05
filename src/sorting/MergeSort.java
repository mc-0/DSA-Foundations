package sorting;

/**
 * A MergeSort implementation supporting both Top-Down (Recursive) and Bottom-Up (Iterative) approaches.
 * This class provides a stable, in-place sorting algorithm with an average-case time complexity of O(n log n).
 * It is suitable for large arrays but requires O(n) auxiliary space due to the need for an auxiliary array
 * during the merge operation.
 * -------------------------------------------------------------------
 * Performance: O(n log n) time complexity for both approaches.
 * Stability: Stable, preserving the order of equal elements.
 * Space Complexity: O(n), not in-place due to auxiliary array.
 *
 * @param <T> the type of elements in the array, which must be comparable
 */
public class MergeSort<T extends Comparable<T>>  {

    public static final String RECURSIVE = "TOP DOWN";
    public static final String ITERATIVE = "BOTTOM UP";

    /**
     * Sorts an array using the specified merge type (either "TOP DOWN" for recursive or "BOTTOM UP" for iterative).
     * Utilizes an auxiliary array to reduce memory allocation overhead.
     *
     * @param collection the array to be sorted
     * @param mergeType  the type of merge sort to use ("TOP DOWN" for recursive, "BOTTOM UP" for iterative)
     */
    public static void sort(int[] collection, String mergeType) {
        int[] aux = new int[collection.length]; // Single auxiliary array for reuse
        if (mergeType.equalsIgnoreCase(RECURSIVE)) {
            System.out.println("Sorting Collection with a Top Down / Recursive Merge Sort");
            recursive(collection, aux, 0, collection.length - 1);
        } else if (mergeType.equalsIgnoreCase(ITERATIVE)) {
            System.out.println("Sorting Collection with a Bottom Up / Iterative Merge Sort");
            iterativeSort(collection, aux);
        } else {
            System.out.println("Please select a valid merge sort implementation");
        }
    }

    /**
     * Recursively sorts the array using a Top-Down (Divide and Conquer) approach.
     * Properties:
     *   Time Complexity: O(n log n)
     *   Space Complexity: O(n)
     *   Stable: Yes
     *   Not in-place due to the auxiliary array.
     * @param a    the array to sort
     * @param aux  auxiliary array to reduce memory allocations
     * @param lo   the starting index
     * @param hi   the ending index
     */
    public static void recursive(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        recursive(a, aux, lo, mid);
        recursive(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    /**
     * Iteratively sorts the array using a Bottom-Up approach, starting with small subarrays and merging upward.
     * -----------------------------------
     * Properties:
     *   Time Complexity: O(n log n)
     *   Space Complexity: O(n)
     *   Stable: Yes
     *   Not in-place due to the auxiliary array.
     * @param a   the array to sort
     * @param aux auxiliary array to reduce memory allocations
     */
    public static void iterativeSort(int[] a, int[] aux) {
        int n = a.length;
        for (int len = 1; len < n; len *= 2) {
            for (int lo = 0; lo < n - len; lo += len + len) {
                merge(a, aux, lo, lo + len - 1, Math.min(lo + len + len - 1, n - 1));
            }
        }
    }

    /**
     * Merges two sorted subarrays into a single sorted subarray using an auxiliary array.
     * Copies data into the auxiliary array, then merges back into the original array by comparing
     * elements one by one from each half. This function assumes that the subarrays are sorted.
     * -----------------------------------
     * Properties:
     *   Time Complexity: O(n)
     *   Space Complexity: O(n), auxiliary array is used
     *   Stable: Yes
     *
     * @param a   the array containing the two subarrays to merge
     * @param aux auxiliary array for temporary storage during merging
     * @param lo  the starting index of the first subarray
     * @param mid the ending index of the first subarray and start of the second
     * @param hi  the ending index of the second subarray
     */
    public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        // Copy elements to auxiliary array
        System.arraycopy(a, lo, aux, lo, hi - lo + 1);

        int i = lo, j = mid + 1;

        // Merge back to original array a
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];           // Left subarray exhausted
            else if (j > hi) a[k] = aux[i++];       // Right subarray exhausted
            else if (aux[j] < aux[i]) a[k] = aux[j++]; // Take element from right subarray
            else a[k] = aux[i++];                   // Take element from left subarray
        }
    }
}
