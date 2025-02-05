package main.patterns.topkelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    // Time: O(D∗logD) where ‘D’ is the number of distinct characters in the input string.
    // O(N∗logN) - In the worst case, when all characters are unique
    // Space: O(N)
    public static String sortCharacterByFrequency(String str) {
        StringBuilder result = new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        maxHeap.addAll(frequencyMap.entrySet());

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currentChar = maxHeap.poll();
            for (int i = 0; i < currentChar.getValue(); i++) {
                result.append(currentChar.getKey());
            }
        }
        return result.toString();
    }

}
