package main.patterns.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Time: O(N*N!)
// Space: O(N*N!)
public class FindPermutations {

    public static List<List<Integer>> find(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> permutations = new LinkedList<>();
        permutations.add(new ArrayList<>());
        for (int currentNum : nums) {

            int n = permutations.size();
            for (int i = 0; i < n; i++) {
                List<Integer> oldPermutation = permutations.poll();

                for (int j = 0; j <= oldPermutation.size(); j++) {
                    List<Integer> newPermutation = new ArrayList<>(oldPermutation);
                    newPermutation.add(j, currentNum);
                    if (newPermutation.size() == nums.length) {
                        result.add(newPermutation);
                    }
                    else {
                        permutations.add(newPermutation);
                    }
                }
            }
        }
        return result;
    }
}
