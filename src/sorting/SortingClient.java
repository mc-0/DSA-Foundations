package sorting;


import sorting.util.CollectionUtil;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class SortingClient {

    public static void main(String[] args) throws FileNotFoundException {
        int[] array = CollectionUtil.populateArray("src\\inputdata\\randomInts.txt");
        int[] generic = {8,1,3,6,9,5,2};
        QuickSort.sort(generic, 0, generic.length-1);
        CollectionUtil.printFormattedArray(generic);
    }






}
