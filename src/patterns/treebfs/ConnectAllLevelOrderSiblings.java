package patterns.treebfs;

import datastructures.trees.NextTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectAllLevelOrderSiblings {

    public static NextTreeNode connect(NextTreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<NextTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                NextTreeNode currentNode = queue.poll();

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

                if (!queue.isEmpty()) {
                    currentNode.next = queue.peek();
                }
                else {
                    currentNode.next = null;
                }
            }
        }
        return root;
    }
}
