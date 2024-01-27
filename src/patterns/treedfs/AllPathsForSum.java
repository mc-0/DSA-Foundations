package patterns.treedfs;

import datastructures.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllPathsForSum {

    // Time: O(n * log(n))
    // Space: O(n * log(n))
    public static List<List<Integer>> hasPaths(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        listPath(root, sum, currentPath, paths);
        return paths;
    }

    private static void listPath(TreeNode root, int sum, List<Integer> currPath, List<List<Integer>> allPaths) {
        if (root == null) {
            return;
        }
        currPath.add(root.val);

        if (root.left == null & root.right == null && sum == root.val) {
            allPaths.add(new ArrayList<>(currPath));
        }
        else {
            listPath(root.left, sum - root.val, currPath, allPaths);
            listPath(root.right, sum - root.val, currPath, allPaths);
        }
        currPath.remove(currPath.size() - 1);
    }
}
