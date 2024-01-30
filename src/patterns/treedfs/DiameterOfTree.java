package patterns.treedfs;

import datastructures.trees.TreeNode;

// Time: O(n)
// Space: O(n)
public class DiameterOfTree {

    private static int treeDiameter;

    public int calculateTreeDiameter(TreeNode root) {
        treeDiameter = 0;
        checkTreeHeight(root);
        return treeDiameter;

    }

    private static int checkTreeHeight(TreeNode currentNode) {
        if (currentNode == null) {
            return 0;
        }

        int leftNodeHeight = checkTreeHeight(currentNode.left);
        int rightNodeHeight = checkTreeHeight(currentNode.right);

        if (leftNodeHeight != 0 && rightNodeHeight != 0) {
            int currentDiameter = leftNodeHeight + rightNodeHeight + 1;
            treeDiameter = Math.max(treeDiameter, currentDiameter);
        }

        return Math.max(leftNodeHeight, rightNodeHeight) + 1;

    }

}
