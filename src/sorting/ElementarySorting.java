/*
package sorting;



 The elementary sorting algorithms help to build a foundational understanding of sorting but aren't widely used.
Insertion sort does however perform well in pne scenario: when dealing with a relatively small number of inputs where the data
is nearly sorted


public class ElementarySorting {

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

            }
        }
        oc.printOperations();
    }

}
*/
