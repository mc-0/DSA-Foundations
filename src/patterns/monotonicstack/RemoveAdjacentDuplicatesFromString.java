package patterns.monotonicstack;

import java.util.Stack;

public class RemoveAdjacentDuplicatesFromString {

    // Time: O(n)
    // Space: O(n)
    // *NOTE: Use StringBuilder as if it WAS a stack! Use deleteCharAt() method like pop, pass in current size - 1!
    public static String removeAdjacentDupes(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        int j = 0;

        while (j < stack.size()) {
            sb.append(stack.get(j));
            j++;
        }
        return sb.toString();
    }
}
