package scratchpad;

import patterns.twopointers.TwoPointers;

import java.util.Arrays;

public class PracticeClient {


    public static void main(String[] args) {

        int[] testArr = new int[] { 1,0,2,1,0 };
        TwoPointers.dutchNationalFlag(testArr);

        System.out.printf(Arrays.toString(testArr));
    }

}
