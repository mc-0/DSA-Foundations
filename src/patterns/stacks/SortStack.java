package patterns.stacks;

import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            int temp = input.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() > temp) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(temp);
        }
        return tmpStack;
    }
}
