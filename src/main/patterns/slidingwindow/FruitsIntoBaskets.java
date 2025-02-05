package main.patterns.slidingwindow;

import java.util.HashMap;

// Time: O(n)
// Space: O(1)
public class FruitsIntoBaskets {
    // ** Exact same process as Longest Substring with K Distinct Characters
    public static int fillBaskets(char[] arr) {
        int windowStart = 0, maxLength = 0;
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            char rightChar = arr[windowEnd];
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

            while (charFrequencyMap.size() > 2) {
                char leftChar = arr[windowStart];
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
