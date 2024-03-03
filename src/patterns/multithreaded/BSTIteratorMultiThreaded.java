package patterns.multithreaded;

import datastructures.trees.TreeNode;

import java.util.Stack;

public class BSTIteratorMultiThreaded {

    private Stack<TreeNode> stack = new Stack<>();
    private Thread t1 = null;

    public BSTIteratorMultiThreaded(TreeNode root) {
        traverseLeft(root);
    }

    /** @return whether we have a next smallest number */
    synchronized public boolean HasNext() {
        checkThread();
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    synchronized public int next() {
        checkThread();
        TreeNode tmpNode = stack.pop();
        traverseLeft(tmpNode.right);
        return tmpNode.val;
    }

    /** traverse the left sub-tree to push all nodes on the stack */
    private void traverseLeft(TreeNode node) {
        // spawn a new thread to process the left sub-tree
        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                TreeNode tmp = node;
                while(tmp != null){
                    stack.push(tmp);
                    tmp = tmp.left;
                }
            }
        });

        t1.start();
    }

    /** if the previous thread is active, wait before it finishes */
    private void checkThread() {
        if( t1 != null && t1.isAlive()) {
            try
            {
                t1.join(); // wait for the thread traversing the left subtree
            } catch(InterruptedException e){ System.out.println(e); }
        }
    }

}
