package sorting;


import sorting.util.InitInput;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class SortingClient {

    public static void main(String[] args) throws FileNotFoundException {
        int[] array = InitInput.populateArray("src\\inputdata\\randomInts.txt");
        SelectionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }






}
