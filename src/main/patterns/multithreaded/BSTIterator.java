package main.patterns.multithreaded;

import main.datastructures.trees.TreeNode;

import java.util.Stack;

public class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        traverseLeft(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    // Synchronized for thread-safety
    // O(1) - amortized cost, O(N) in the worst case
    synchronized public int next() {
        TreeNode tmpNode = stack.pop();
        traverseLeft(tmpNode.right);
        return tmpNode.val;
    }

    /** traverse the left sub-tree to push all nodes on the stack */
    private void traverseLeft(TreeNode node) {
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }

}
