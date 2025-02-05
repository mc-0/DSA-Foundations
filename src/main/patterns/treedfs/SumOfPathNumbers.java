package main.patterns.treedfs;

import main.datastructures.trees.TreeNode;

public class SumOfPathNumbers {

    // Time: O(n)
    // Space: O(n)
    public static int getTreeSum (TreeNode root) {
        return traverseAndCalculate(root, 0);
    }

    private static int traverseAndCalculate(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum = sum * 10 + node.val;

        if (node.left == null & node.right == null) {
            return sum;
        }

        return traverseAndCalculate(node.left,sum) + traverseAndCalculate(node.right, sum);
    }
}
