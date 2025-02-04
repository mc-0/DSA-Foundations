package patterns.treebfs;

import datastructures.trees.NextTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectLevelOrderSiblings {

    public static NextTreeNode connect(NextTreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<NextTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                NextTreeNode currentNode = queue.poll();
                if (i + 1 == queueSize) {
                    currentNode.next = null;
                }
                else {
                    currentNode.next = queue.peek();
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return root;
    }
}
