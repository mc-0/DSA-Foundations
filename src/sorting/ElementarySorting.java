package sorting;

import java.util.Arrays;
import java.util.List;

/* The elementary sorting algorithms help to build a foundational understanding of sorting but aren't widely used.
Insertion sort does however perform well in pne scenario: when dealing with a relatively small number of inputs where the data
is nearly sorted
 */
public class ElementarySorting {

    // BUBBLESORT - 'Bubbles' the current value up to the end of the array to sort in ascending order.
    // Runtime: O(n^2) Quadratic || Space: O(1) || Stable
    // https://youtu.be/F13_wsHDIG4
    public static void bubbleSort(int[] arr){
        OperationCounter oc = new OperationCounter();
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    oc.incrementOperation();
                }
            }
        }
        oc.printOperations();
    }

    // SELECTION SORT - Marks the current value as the minimum, which is updated is a lesser value is found.
    // At the end, swaps the initial minimum with the new compared minimum.
    // Runtime: O(n^2) Quadratic || Space: O(1) || Unstable Sort
    // https://www.youtube.com/watch?v=cqh8nQwuKNE
    public static void selectionSort(int[] arr){
        OperationCounter oc = new OperationCounter();
        int min, minIndex;
        for (int i = 0; i < arr.length - 1; i++){
            min = arr[i];
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            oc.incrementOperation();
        }
        oc.printOperations();
    }

    // INSERTION SORT - Treats the first item in an array as sorted & continues to sort successive values to where they belong.
    // Runtime: O(n^2) Quadratic || Space: O(1) || Stable Sort
    // https://www.youtube.com/watch?v=lCDZ0IprFw4
    // In the best case can be O(n) linear time complexity if dealing with a small number of inputs that are nearly sorted.
    public static void insertionSort(int[] arr){
        OperationCounter oc = new OperationCounter();
        int temp;
        for (int i = 1; i < arr.length; i++){
            int currentValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
                oc.incrementOperation();
            }
        }
        oc.printOperations();
    }

}
