package main.patterns.hashmaps;

import java.util.HashMap;

public class LongestPalindrome {

    // Time: O(n)
    // Space: O(n)
    public static int find(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int result = 0;
        boolean extraChar = false;

        for (Character c : map.keySet()) {
            if (map.get(c) % 2 == 1) {
                result += map.get(c) - 1;
                extraChar = true;
            }
            else {
                result += map.get(c);
            }
        }
        if (extraChar) {
            result++;
        }
        return result;
    }
}
