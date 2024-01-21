package patterns.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreatestElement {

    public static List<Integer> find(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr.get(i)) {
                s.pop();
            }

            res.add(i, s.isEmpty() ? -1 : s.peek());
            s.push(arr.get(i));
        }
        return res;
    }
}
