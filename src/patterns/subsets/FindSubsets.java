package patterns.subsets;

import java.util.ArrayList;
import java.util.List;

// Time: O(N * 2^N)
// Space: O(N * 2^N)
// Due to subsets doubling at each step
public class FindSubsets {

    public static List<List<Integer>> find(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int num : nums) {
            int n = subsets.size();
            for (int i = 0; i < n; i++) {
                List<Integer> set = new ArrayList<>(subsets.get(i));
                set.add(num);
                subsets.add(set);
            }
        }
        return subsets;
    }
}
