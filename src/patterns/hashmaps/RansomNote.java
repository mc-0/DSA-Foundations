package patterns.hashmaps;

import java.util.HashMap;

public class RansomNote {

    public static boolean makeNote(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
