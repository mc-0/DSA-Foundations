package util;

import datastructures.linkedlists.ListNode;

import java.util.Arrays;

public class Helper {

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.value);
            head = head.next;
            if (head != null) {
                sb.append(" -> ");
            }
        }
        System.out.println(sb);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }


}
