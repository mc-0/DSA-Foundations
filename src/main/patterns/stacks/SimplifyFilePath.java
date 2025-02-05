package main.patterns.stacks;

import java.util.Stack;

public class SimplifyFilePath {

    public static String simplify(String s) {
        Stack<String> stack = new Stack<>();

        for (String dir : s.split("/")) {
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if (!dir.isEmpty() && !dir.equals(".")){
                stack.push(dir);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String str : stack) {
            result.append("/");
            result.append(str);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
