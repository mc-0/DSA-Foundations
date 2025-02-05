package main.patterns.stacks;

import java.util.Stack;

public class ConvertDecimalToBinary {

    public static String convert(int num) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int count = num;
        while (count > 0) {
            stack.push(count % 2);
            count /= 2;
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
