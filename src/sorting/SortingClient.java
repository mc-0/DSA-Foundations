package sorting;

import java.util.Arrays;

public class SortingClient {

    public static void main(String[] args) {
        int[] input = {7,3,1,4,8,2,9,5,0,6};
        BottomUpMergeSort.sort(input);
        System.out.println(Arrays.toString(input ));
    }






}
