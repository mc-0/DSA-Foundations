package main.patterns.backtracking;

import java.util.ArrayList;
import java.util.List;
/*
39. Combination Sum
Time: O(N^[N/M + 1])
Space: O(N/M)
 */
public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates,int start, int target, List<Integer> currentSet, List<List<Integer>> result) {
        // We completed a set meeting constraint
        if (target == 0) {
            result.add(new ArrayList<>(currentSet));
            return;
        }

        // Iterate through the candidates array starting from the given index
        for (int i = start; i < candidates.length; i++) {
            // If the current candidate is greater than the remaining target, move on to the
            // next
            if (target < candidates[i]) {
                continue;
            }
            // Add the current candidate to the current combination
            currentSet.add(candidates[i]);
            // Recursively call the function with the updated combination and remaining
            // target
            backtrack(candidates, i, target - candidates[i], currentSet, result);
            // Backtrack by removing the last added candidate from the combination
            currentSet.remove(currentSet.size() - 1);
        }
    }

}
