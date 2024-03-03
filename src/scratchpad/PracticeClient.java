package scratchpad;

import patterns.orderedset.MyCalendarI;

import java.util.HashMap;
import java.util.Map;

public class PracticeClient {

    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());

        int scanner = 0;
        int[] n = {0,1,2,3,4,5};
        System.out.println(n[scanner++]);
        System.out.println(n[scanner]);



    }


    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s1 = new HashMap<>();
        Map<Character, Integer> s2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            s1.put(c, s1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            s2.put(c, s2.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : s1.entrySet()) {
            if (s2.get(entry.getKey()) != entry.getValue()) {
                return false;
            }
        }

        return true;
    }
    }

