package sorting;
// Divide & Conquer - Typically done recursively
// Time: O(n log n)
// Space: O(n)

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr){
        mergesort(arr, new int[arr.length], 0, arr.length - 1);
    }

    public static void mergesort(int[] arr, int[] temp, int leftStart, int rightEnd){
        if (leftStart >= rightEnd){
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergesort(arr, temp, leftStart, middle);
        mergesort(arr, temp, middle + 1, rightEnd);
        mergeHalves(arr, temp, leftStart, rightEnd);

    }

    public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd){
            if (arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            }
            else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }


}
