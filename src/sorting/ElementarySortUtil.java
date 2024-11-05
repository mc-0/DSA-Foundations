package sorting;

import util.Swapper;

// Collection of the most basic elementary sorting techniques.
// Primarily used in the process of learning sorting strategies
public class ElementarySortUtil {

    // Runtime: O(n^2) Quadratic || Space: O(1) || Stable
    public static void bubbleSort(int [] collection){
        int n = collection.length;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if (collection[j - 1] > collection[j]) {
                    Swapper.swap(collection, j-1, j);
                }
            }
        }
    }

    /***
     * Treats the first item in an array as sorted & continues to sort successive values to where they belong.
     * Runtime: O(n^2) Quadratic || Space: O(1) || Stable Sort
     * In the best case can be O(n) linear time complexity if dealing with a small number of inputs that are nearly sorted.
     ***/
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++){

            int currentValue = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > currentValue){
                Swapper.swap(a, j, j+1);
                j--;
            }
        }
    }

    /***
     * Marks the current value as the minimum, which is updated if a lesser value is found.
     * At the end, swaps the initial minimum with the new compared minimum.
     * Runtime: O(n^2) Quadratic || Space: O(1) || Unstable Sort
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
