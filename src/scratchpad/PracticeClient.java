package scratchpad;

import patterns.matrixtraversal.*;
import patterns.twoheaps.MedianInNumberStream;
import patterns.util.Helper;

import java.util.Collections;
import java.util.PriorityQueue;

public class PracticeClient {

    public static void main(String[] args) {
        MedianInNumberStream ms = new MedianInNumberStream();
        ms.insertNum(1);
        ms.insertNum(3);
        ms.insertNum(7);
        ms.insertNum(2);
        ms.insertNum(9);

        System.out.println(ms.findMedian());
    }



    }

