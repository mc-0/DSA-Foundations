package scratchpad;

import datastructures.linkedlists.ListNode;
import patterns.cyclicsort.*;
import patterns.monotonicstack.DailyTemperatures;
import patterns.reverselinkedlist.ReverseAlternatingKElementSubList;
import patterns.reverselinkedlist.ReverseEveryKElementSubList;
import patterns.reverselinkedlist.ReverseSubList;
import patterns.util.Helper;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {
        int[] nums = {70, 73, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(DailyTemperatures.getTemps(nums)));

    }

}
