package patterns.multithreaded;

import datastructures.trees.TreeNode;
// Time: O(N) - # of Nodes in the tree
// Space: O(H) - Where H is the height of the tree (recursion stack)
public class InvertBinaryTreeMultiThread {

    public static TreeNode invertTree(TreeNode root) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        return invertTreeMultiThreaded(root, numThreads);
    }

    private static TreeNode invertTreeMultiThreaded(TreeNode root, int numThreads) {
        if (root == null) return null;

        // invert the current node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (numThreads > 0) {
            // spawn a separate thread to invert the left sub-tree
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    invertTreeMultiThreaded(root.left, numThreads/2);
                }
            });
            t1.start();

            // invert the right sub-tree in the same thread
            invertTreeMultiThreaded(root.right, numThreads/2);

            try {
                t1.join(); // wait for the thread inverting the left subtree
            } catch(InterruptedException e){ System.out.println(e); }

        } else {
            invertTreeMultiThreaded(root.left, 0);
            invertTreeMultiThreaded(root.right, 0);
        }

        return root;
    }

}
