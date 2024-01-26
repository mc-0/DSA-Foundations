package patterns.treebfs;

import datastructures.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindLevelSuccessor {

    public static TreeNode find(TreeNode root, int key) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode successor = null;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            for (int i = 0; i < qSize; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
                if (currentNode.val == key) {
                    return queue.poll();
                }
            }
        }
        return successor;
    }
}
