package sorting;


import sorting.util.InitInput;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class SortingClient {

    public static void main(String[] args) throws FileNotFoundException {
        int[] array = InitInput.populateArray("src\\inputdata\\randomInts.txt");
        int[] generic = {10,8,1,3,6,9,0,2,4,7,5};
        InsertionSort.sort(generic);
        System.out.println(Arrays.toString(generic));
    }






}
