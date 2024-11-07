package sorting;

import util.Helper;

public class HeapSort {

    // This class should not be instantiated.
    private HeapSort() {
    }

    /**
     * Sorts the array in ascending order using heap sort.
     *
     * Heap Sort consists of two main phases:
     * 1. Heapify Phase: Builds a max-heap from the input array.
     * 2. Sortdown Phase: Continuously extracts the max element and restores the heap invariant.
     *
     * Time Complexity:
     * - Heapify Phase: O(N), where N is the number of elements.
     * - Sortdown Phase: O(N log N), as each removal involves a sink operation.
     * - Overall: O(N log N)
     *
     * Space Complexity: O(1) auxiliary (in-place sorting).
     *
     * @param pq the array to be sorted
     */
    public static void sort(Comparable[] pq) {
        int n = pq.length;

        // Heapify Phase: Build the max-heap
        for (int k = n / 2; k >= 1; k--)
            sink(pq, k, n);

        // Sortdown Phase: Sort the array by repeatedly removing the max element
        int k = n;
        while (k > 1) {
            exch(pq, 1, k--);  // Move the current max to the end
            sink(pq, 1, k);    // Restore heap property for the remaining elements
        }
    }

    /**
     * Sinks the element at index k in the heap to its proper position to maintain the max-heap invariant.
     *
     * @param pq the heap represented as an array
     * @param k  the index of the element to sink
     * @param n  the effective size of the heap
     *
     * Time Complexity: O(log N) for each call, as it traverses the height of the heap.
     */
    private static void sink(Comparable[] pq, int k, int n) {
        while (2 * k <= n) {         // While there is at least one child
            int j = 2 * k;           // Left child
            if (j < n && less(pq, j, j + 1)) j++;  // Select the larger child
            if (!less(pq, k, j)) break;  // If the current node is larger, stop
            exch(pq, k, j);          // Swap with the larger child
            k = j;                   // Move down to the larger child
        }
    }

    /**
     * Compares two elements in the array.
     *
     * @param pq the array
     * @param i  the index of the first element (1-based)
     * @param j  the index of the second element (1-based)
     * @return true if pq[i - 1] is less than pq[j - 1], false otherwise
     *
     * Time Complexity: O(1)
     */
    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i - 1].compareTo(pq[j - 1]) < 0;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param pq the array
     * @param i  the index of the first element (1-based)
     * @param j  the index of the second element (1-based)
     *
     * Time Complexity: O(1)
     */
    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = swap;
    }

    /**
     * Prints the elements of the array to standard output.
     * Useful for debugging or visualizing the array content.
     *
     * @param a the array to print
     */
    protected static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
