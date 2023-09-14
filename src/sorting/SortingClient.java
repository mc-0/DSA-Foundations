package sorting;


import sorting.util.CollectionUtil;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class SortingClient {

    public static void main(String[] args) throws FileNotFoundException {
        int[] array = CollectionUtil.populateArray("src\\inputdata\\randomInts.txt");
        int[] generic = {10,8,1,3,6,9,0,2,4,7,5};
        MergeSort.sort(array, "bottom up");
        CollectionUtil.printFormattedArray(array);
    }






}
