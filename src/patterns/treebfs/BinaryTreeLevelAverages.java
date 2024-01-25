package patterns.treebfs;

import datastructures.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelAverages {
    public static List<Double> findAverages(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            double levelAvg = 0;
            for (int i = 0; i < queueSize; i++) {
                TreeNode currentNode = queue.poll();
                levelAvg += currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            levelAvg /= queueSize;
            result.add(levelAvg);
        }
        return result;
    }
}
