package main.patterns.multithreaded;

import main.datastructures.trees.TreeNode;

public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // invert children of the current node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // invert left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
