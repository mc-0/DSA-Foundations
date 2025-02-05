package main.patterns.slidingwindow;

import java.util.HashMap;
// 3090. Maximum Length Substring With Two Occurrences
public class MaxLengthSubStringTwoOccurances {

    public int maximumLengthSubstring(String s) {
        int result = 0;

        for (int start = 0; start < s.length(); start++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int end = start;

            while (end < s.length()) {
                char curr = s.charAt(end);
                if (map.containsKey(curr) && map.get(curr) == 2) {
                    break;
                }
                else {
                    map.put(curr, map.getOrDefault(curr,0) + 1);
                }
                end++;
            }
            result = Math.max(result, end - start);
        }
        return result;
    }

}
