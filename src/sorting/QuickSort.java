package sorting;

import util.Helper;

/**
 * A generic QuickSort implementation for sorting arrays of any type that implements {@link Comparable}.
 * This class provides an in-place, recursive sorting algorithm with average-case time complexity of O(n log n).
 * ----------------------------------------------------------------------
 * Time Complexity: O(n log n) on average, O(n²) in the worst case.
 * Space Complexity: O(log n) due to recursion stack; in-place with constant extra space
 * Stability: Not stable. Equal elements may not retain their original order.
 * In-Place: Yes
 * ----------------------------------------------------------------------
 * @param <T> the type of elements in the array, which must be comparable
 */
public class QuickSort<T extends Comparable<T>> {

    /**
     * Sorts the specified array using the QuickSort algorithm.
     *
     * @param arr  the array to be sorted
     * @param left  the starting index of the range to be sorted
     * @param right  the ending index of the range to be sorted
     */
    public void sort(T[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        T pivot = medianOfThree(arr, left, right);
        int index = partition(arr, left, right, pivot);
        sort(arr, left, index - 1);
        sort(arr, index, right);
    }

    /**
     * Using just the middle element is OK in most cases, but performance can suffer on already sorted or nearly sorted arrays.
     * Selects a median-of-three pivot element to improve performance
     * @param arr  the array being sorted
     * @param left  the starting index for the pivot selection
     * @param right  the ending index for the pivot selection
     * @return  the median-of-three element used as the pivot
     */
    private T medianOfThree(T[] arr, int left, int right) {
        int mid = (left + right) / 2;

        if (arr[left].compareTo(arr[mid]) > 0) {
            Helper.swap(arr, left, mid);
        }
        if (arr[left].compareTo(arr[right]) > 0) {
            Helper.swap(arr, left, right);
        }
        if (arr[mid].compareTo(arr[right]) > 0) {
            Helper.swap(arr, mid, right);
        }

        return arr[mid];
    }

    /**
     * Partitions the array around a pivot, such that elements less than the pivot come before it
     * and elements greater than the pivot come after it.
     *
     * @param arr  the array to partition
     * @param start  the starting index of the partition range
     * @param end  the ending index of the partition range
     * @param pivot  the pivot element
     * @return  the partition index
     */
    private int partition(T[] arr, int start, int end, T pivot) {
        while (start <= end) {
            while (arr[start].compareTo(pivot) < 0) {
                start++;
            }
            while (arr[end].compareTo(pivot) > 0) {
                end--;
            }
            if (start <= end) {
                Helper.swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
}
