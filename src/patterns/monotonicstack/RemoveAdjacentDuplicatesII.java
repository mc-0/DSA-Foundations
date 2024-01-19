package patterns.monotonicstack;

import java.util.Stack;

public class RemoveAdjacentDuplicatesII {

    // Time: O(n)
    // Space: O(n)
    // **NOTE** The stack contains primitive type int arrays containing the character and its current count
    // This is possible because when converting to a char array on like 14, the character 'c' is represented
    // as an int. In Java, each element in the char array holds the Unicode code point of the corresponding character in the string
    // This is why the value is cast to a char on like 31
    public static String remove(String s, int k) {
        Stack<int[]> stack = new Stack();

        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;
            }
            else {
                stack.push(new int[] {c, 1});
            }
            if (stack.peek()[1] == k) {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            int[] top = stack.pop();
            sb.append(String.valueOf((char) top[0]).repeat(top[1]));
        }
        return sb.reverse().toString();
    }
}
