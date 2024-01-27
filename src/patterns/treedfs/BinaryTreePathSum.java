package patterns.treedfs;

import datastructures.trees.TreeNode;

public class BinaryTreePathSum {

    public static boolean hasPath(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null & root.val == sum){
            return true;
        }

        return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
    }

}
