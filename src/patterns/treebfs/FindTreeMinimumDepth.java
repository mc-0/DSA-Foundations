package patterns.treebfs;

import datastructures.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindTreeMinimumDepth {

    public static int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int minimumDepth = 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            minimumDepth++;
            for (int i = 0; i < qSize; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode.left == null & currentNode.right == null) {
                    return minimumDepth;
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);

                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }
        }
        return minimumDepth;
    }
}
