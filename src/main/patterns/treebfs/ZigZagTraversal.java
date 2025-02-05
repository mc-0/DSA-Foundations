package main.patterns.treebfs;

import main.datastructures.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

    public static List<List<Integer>> zigZag(TreeNode root) {
        if (root == null) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = false;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            List<Integer> currentLevel = new LinkedList<>();
            for (int i = 0; i < queueSize; i++){
                TreeNode currentNode = queue.poll();

                if (leftToRight) {
                    currentLevel.add(currentNode.val);
                }
                else {
                    currentLevel.add(0, currentNode.val);
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
            leftToRight = !leftToRight;
        }
        return result;
    }
}
