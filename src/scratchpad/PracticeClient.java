package scratchpad;

import patterns.slidingwindow.SlidingWindow;

public class PracticeClient {


    public static void main(String[] args) {

        int[] nums = {1,1,1,1,2,2,2,2};

        SlidingWindow sw = new SlidingWindow();
        int count = sw.numIdenticalPairs(nums);

        System.out.println("Good Pairs: " + count);



    }

}
