package sorting;

import sorting.util.Swapper;

// Best case time complexity => O(n log n). Pivot falls in the median. Won't necessarily happen (maybe randomly).
// Worst case time complexity => O(n^2). Happens when the list is already sorted.
// >>> Mitigate the worst case by choosing the middle element or random element as the pivot.
// Space Complexity: Recursive solution makes use of a stack. Can be O(log n) - O(n))
public class QuickSort {

    public static void sort(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        int pivot = arr[(left + right) /  2];
        int index = partition(arr, left, right, pivot);
        sort(arr, left, index - 1);
        sort(arr, index, right);
    }

    private static int partition(int[] arr, int start, int end, int pivot){
        while (start <= end){
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if (start <= end){
                Swapper.swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
}
