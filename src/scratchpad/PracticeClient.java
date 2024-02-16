package scratchpad;

import patterns.topkelements.kclosestnumbers.KClosestNumbers;

public class PracticeClient {

    public static void main(String[] args) {
//        [0,0,1,2,3,3,4,7,7,8] x: 3 k:5 -- Fails in LC
        // Output: 347, should be
        int[] n = {0,0,1,2,3,3,4,7,7,8};
        System.out.println(KClosestNumbers.findClosestElements(n, 3, 5));
    }



    }

