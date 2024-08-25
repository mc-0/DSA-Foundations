package patterns.arrays_and_hashing;

import java.util.HashSet;

// 217. Contains Duplicate
public class ContainsDuplicate {

    public boolean useSet(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (unique.contains(num)) {
                return true;
            }
            unique.add(num);
        }
        return false;
    }
}
