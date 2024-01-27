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
import patterns.treebfs.FindTreeMinimumDepth;
import patterns.treedfs.BinaryTreePathSum;
import patterns.treedfs.SumOfPathNumbers;
import patterns.util.Helper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeClient {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(2);

        System.out.println(SumOfPathNumbers.getTreeSum(root));


        }
    }

