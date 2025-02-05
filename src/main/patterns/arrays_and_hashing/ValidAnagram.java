package main.patterns.arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;
// 242. Valid Anagram
public class ValidAnagram {

    public boolean useHashMap(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

}
