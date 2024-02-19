package patterns.greedyalgorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

// Time: O(N)
// Space: O(1)
public class RemoveDuplicateLetters {

    public static String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> count = new HashMap<>(); // Count frequency of each character
        HashSet<Character> present = new HashSet<>(); // Tracks each characters uniqueness in the RESULT string
        Stack<Character> result = new Stack<>(); // Prepares the order of the result string

        // Counting the frequency of each character
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (!present.contains(c)) {
                // Ensure the smallest lexicographical order by removing higher characters that will appear again
                while (!result.isEmpty() && c < result.peek() && count.get(result.peek()) > 0) {
                    present.remove(result.pop());
                }
                result.push(c);
                present.add(c);
            }
            count.put(c, count.get(c) - 1); // Decreasing the frequency
        }

        // Building the result string from the stack
        StringBuilder sb = new StringBuilder();
        for (char c : result) {
            sb.append(c);
        }
        return sb.toString();
    }

}
