package scratchpad;

import datastructures.linkedlists.ListNode;
import patterns.cyclicsort.*;
import patterns.monotonicstack.DailyTemperatures;
import patterns.monotonicstack.RemoveAdjacentDuplicatesFromString;
import patterns.monotonicstack.RemoveAdjacentDuplicatesII;
import patterns.monotonicstack.RemoveNodeFromLinkedList;
import patterns.reverselinkedlist.ReverseAlternatingKElementSubList;
import patterns.reverselinkedlist.ReverseEveryKElementSubList;
import patterns.reverselinkedlist.ReverseSubList;
import patterns.util.Helper;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {
        String f = "abbbaaca";
        int[] a = new int[f.length()];
//        System.out.println(RemoveAdjacentDuplicatesII.remove(f, 3));
        for (int i = 0; i < f.length(); i++) {
            a[i] = f.charAt(i);
        }

        System.out.println(Arrays.toString(a));
    }

}
