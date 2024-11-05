package sorting;


import util.CollectionUtil;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class SortingClient {

    public static void main(String[] args) throws FileNotFoundException {
        Integer[] generic = {55, 12, 300, 21, 7};
        QuickSelect<Integer> qs = new QuickSelect<>();
        System.out.println(qs.select(generic, 2));

    }






}
