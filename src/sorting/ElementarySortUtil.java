package sorting;

import util.Swapper;

// Collection of the most basic elementary sorting techniques.
// Primarily used in the process of learning sorting strategies
public class ElementarySortUtil {

    // Runtime: O(n^2) Quadratic || Space: O(1) || Stable || In-Place
    public static void bubbleSort(int[] collection) {
        int n = collection.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 1; j < n - i; j++) {
                if (collection[j - 1] > collection[j]) {
                    Swapper.swap(collection, j - 1, j);
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }


    /***
     * Treats the first item in an array as sorted & continues to sort successive values to where they belong.
     * Runtime: O(n^2) Quadratic || Space: O(1) || Stable Sort || In-Place
     * In the best case can be O(n) linear time complexity if dealing with a small number of inputs that are nearly sorted.
     ***/
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int currentValue = a[i];
            int j = i - 1;

            // Shift elements of the sorted part of the array to the right to make room for currentValue
            while (j >= 0 && a[j] > currentValue) {
                a[j + 1] = a[j];
                j--;
            }

            // Place currentValue in its correct position
            a[j + 1] = currentValue;
        }
    }


    /***
     * Marks the current value as the minimum, which is updated if a lesser value is found.
     * At the end, swaps the initial minimum with the new compared minimum.
     * Runtime: O(n^2) Quadratic || Space: O(1) || Unstable Sort || In-Place
     * O(n^2) compares even if partially / totally sorted
     ***/
    public static void selectionSort(int[] a) {
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
