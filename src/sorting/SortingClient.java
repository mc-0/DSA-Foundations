package sorting;


import datastructures.heaps.MaxHeap;
import util.CollectionUtil;

import java.io.FileNotFoundException;
import java.util.*;

public class SortingClient {

    public static void main(String[] args) throws FileNotFoundException {
        Integer[] generic = {55, 12, 300, 21, 7, 1, 35, 709, 14, 4, 51};

        System.out.println(Arrays.asList(generic));
        HeapSort.sort(generic);
        System.out.println(Arrays.asList(generic));


    }
}
