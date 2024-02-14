package scratchpad;

import patterns.bitwisexor.ComplimentBaseTen;
import patterns.bitwisexor.SingleNumber;
import patterns.bitwisexor.TwoSingleNumbers;
import patterns.modifiedbinarysearch.*;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {
        int num = 5;
        int bitCount = 0;
        int n = num;
        while (n > 0) {
            bitCount++;
            n = n >> 1;
        }
        System.out.println(bitCount);
    }



    }

