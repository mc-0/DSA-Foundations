package sorting;

import util.Helper;

import java.util.Random;

/**
 * A generic QuickSelect implementation for selecting the k-th smallest element from an array
 * of any type that implements {@link Comparable}.
 *
 * This class utilizes the QuickSelect algorithm, which is based on the principles of QuickSort.
 * It has an average-case time complexity of O(n) and a worst-case time complexity of O(n²).
 * The algorithm is not stable and operates in-place.
 *
 * @param <T> the type of elements in the array, which must be comparable
 */
public class QuickSelect<T extends Comparable<T>> {

    private Random random = new Random(); // For random pivot selection

    /**
     * Selects the k-th smallest element from the specified array.
     *
     * @param a the array from which to select the element
     * @param k the index (0-based) of the element to select
     * @return the k-th smallest element in the array
     * @throws IllegalArgumentException if k is out of bounds
     */
    public T select(T[] a, int k) {
        if (k < 0 || k >= a.length) {
            throw new IllegalArgumentException("Index is not between 0 and " + a.length + ": " + k);
        }
        Helper.shuffle(a); // Shuffle to ensure good average performance
        int lo = 0, hi = a.length - 1;
        while (hi > lo) {
            int i = partition(a, lo, hi);
            if (i > k) hi = i - 1; // Search in the left part
            else if (i < k) lo = i + 1; // Search in the right part
            else return a[i]; // Found the k-th smallest element
        }
        return a[lo]; // Return the k-th smallest element when hi == lo
    }

    /**
     * Partitions the array around a pivot element.
     * Elements less than the pivot come before it, and elements greater than the pivot come after it.
     *
     * @param a the array to partition
     * @param lo the starting index of the partition range
     * @param hi the ending index of the partition range
     * @return the new position of the pivot after partitioning
     */
    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo]; // Choosing the pivot (first element)

        while (true) {
            // Find item on lo to swap
            while (less(a[++i], v)) {
                if (i == hi) break; // Reached the end
            }

            // Find item on hi to swap
            while (less(v, a[--j])) {
                if (j == lo) break; // Reached the start
            }

            // Check if pointers cross
            if (i >= j) break;

            Helper.swap(a, i, j); // Swap elements
        }

        Helper.swap(a, lo, j); // Put partitioning item v at a[j]

        // Now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j; // Return the new index of the pivot
    }

    /**
     * Compares two elements for ordering.
     * This method optimizes the comparison by checking for reference equality first.
     *
     * @param v the first element to compare
     * @param w the second element to compare
     * @return true if v is less than w, false otherwise
     */
    private static boolean less(Comparable v, Comparable w) {
        if (v == w) return false; // Optimization when reference equals
        return v.compareTo(w) < 0;
    }
}
