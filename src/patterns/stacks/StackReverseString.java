package patterns.stacks;

import java.util.Stack;

public class StackReverseString {

    public static String reverse(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
