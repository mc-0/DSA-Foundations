package sorting;


import sorting.util.InitInput;

import java.io.FileNotFoundException;

public class SortingClient {

    public static void main(String[] args) throws FileNotFoundException {
        int[] array = InitInput.populateArray("src\\inputdata\\randomInts.txt");
        System.out.println(array.length);
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
        bubbleSort.printList();
    }






}
