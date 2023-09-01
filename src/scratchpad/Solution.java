package scratchpad;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public static boolean isPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char currentLetter = Character.toLowerCase(sentence.charAt(i));
            if (Character.isAlphabetic(currentLetter)) {
                set.add(currentLetter);
            }
        }
        return set.size() == 26;
    }


}
