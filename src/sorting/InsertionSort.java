package sorting;

import sorting.util.Swapper;

public class InsertionSort {

    // Treats the first item in an array as sorted & continues to sort successive values to where they belong.
    // Runtime: O(n^2) Quadratic || Space: O(1) || Stable Sort
    // In the best case can be O(n) linear time complexity if dealing with a small number of inputs that are nearly sorted.
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++){

            int currentValue = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > currentValue){
                Swapper.swap(a, j, j+1);
                j--;

            }
        }
    }

}
