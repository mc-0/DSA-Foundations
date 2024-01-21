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
import patterns.stacks.BalancedParentheses;
import patterns.stacks.ConvertDecimalToBinary;
import patterns.stacks.SimplifyFilePath;
import patterns.stacks.StackReverseString;
import patterns.util.Helper;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {
        String s1 = "/a/b//c//d/.././e/./././f/";

        System.out.println(SimplifyFilePath.simplify(s1));
    }

}
