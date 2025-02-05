package main.patterns.stacks;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean checkIfBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if ((c == ')' && stack.peek() == '(') ||
                        (c == '}' && stack.peek() == '{') ||
                        (c == ']' && stack.peek() == '[')) {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
