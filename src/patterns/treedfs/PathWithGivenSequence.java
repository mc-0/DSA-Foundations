package patterns.treedfs;

import datastructures.trees.TreeNode;

public class PathWithGivenSequence {
    public static boolean hasSequence(TreeNode root, int[] sequence) {
        return nextNode(root, 0, sequence);
    }

    private static boolean nextNode(TreeNode n, int i, int[] seq) {
        if (n == null) {
            return false;
        }

        if (i >= seq.length || n.val != seq[i]) {
            return false;
        }

        if (i == seq.length - 1 && n.left == null && n.right == null) {
            return true;
        }


        return nextNode(n.left, i + 1, seq) || nextNode(n.right, i + 1, seq);
    }
}
