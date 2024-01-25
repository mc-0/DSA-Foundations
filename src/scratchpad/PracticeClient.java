package scratchpad;

import datastructures.linkedlists.ListNode;
import datastructures.trees.TreeNode;
import patterns.cyclicsort.*;
import patterns.hashmaps.FirstNonRepeatChar;
import patterns.hashmaps.LargestUniqueNumber;
import patterns.hashmaps.LongestPalindrome;
import patterns.hashmaps.RansomNote;
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
import patterns.treebfs.BinaryTreeLevelAverages;
import patterns.treebfs.BinaryTreeLevelOrderTraversal;
import patterns.util.Helper;

import java.util.Arrays;

public class PracticeClient {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(17);
        root.left = new TreeNode(7);
        root.right = new TreeNode(21);
        root.left.left = new TreeNode(91);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(58);

        System.out.println(BinaryTreeLevelAverages.findAverages(root));


        }
    }

