package sorting;


import util.CollectionUtil;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class SortingClient {

    public static void main(String[] args) throws FileNotFoundException {
        int[] array = CollectionUtil.populateArray("src\\inputdata\\randomInts.txt");
        Integer[] generic = {8,1,3,6,9,5,2,4,7};
        QuickSort<Integer> qs = new QuickSort();
        qs.sort(generic, 0, generic.length-1);
        System.out.println(Arrays.asList(generic));
    }






}
