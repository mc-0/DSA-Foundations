package main.patterns.backtracking;

import java.util.HashSet;
import java.util.Set;
/*
1593. Split a String Into the Max Number of Unique Substrings
Time: O(2^n)
Space: O(N)
*/
public class StringSplitUniqueSubstrings {

    public static int maxUniqueSplit(String s) {
        return splitAndCount(s, 0, new HashSet<>());
    }

    public static int splitAndCount(String s, int start, Set<String> set) {
        if (start == s.length()) {
            return set.size();
        }

        int count = 0;
        for (int i = start + 1; i <= s.length(); i++) {
            String subString = s.substring(start, i);
            if (set.add(subString)) {
                count = Math.max(count, splitAndCount(s, i, set));
                set.remove(subString);
            }
        }
        return count;
    }

}
