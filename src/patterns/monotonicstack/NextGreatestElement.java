package patterns.monotonicstack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreatestElement {

    // Time: O(n)
    // Space: O(n)
    public int[] findNext(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                hm.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        // USE: nums1[i] = map.getOrDefault(nums1[i], -1); line 27
        // Instead of using this loop***
        while (!stack.isEmpty()) {
            hm.put(stack.pop(), -1);
        }

        for (int j = 0; j < nums1.length; j++) {
            answer[j] = hm.get(nums1[j]);
        }
        return answer;
    }
}
