package patterns.monotonicstack;

import java.util.Stack;

public class DailyTemperatures {

    public static int[] getTemps(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();  // Initialize a stack to store indices of temperatures.
        int[] res = new int[temperatures.length];  // Initialize a result array.

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                // While the stack is not empty and the current temperature is higher
                // than the temperature at the index stored at the top of the stack:
                int idx = stack.pop();  // Pop the top index from the stack.
                res[idx] = i - idx;  // Calculate the number of days until warmer temperature.
            }
            stack.push(i);  // Push the current index onto the stack.
        }
        return res;
    }
}
