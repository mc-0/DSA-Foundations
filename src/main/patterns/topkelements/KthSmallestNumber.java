package main.patterns.topkelements;

import java.util.PriorityQueue;

// Time: O(N*logK)
// Space: O(K)
public class KthSmallestNumber {

    public static int findKthSmallestNumber(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int n : nums) {
            heap.add(n);
        }
        int result = 0;
        for (int i = k; i > 0; i--) {
            result = heap.poll();
        }
        return result;
    }

}
