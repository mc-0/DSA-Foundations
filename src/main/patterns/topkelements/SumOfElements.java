package main.patterns.topkelements;

import java.util.PriorityQueue;

// Time: O(N*logN)
// Space: O(N)
public class SumOfElements {

    public static int findSumOfElements(int[] nums, int k1, int k2) {
        int elementSum = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : nums) {
            minHeap.add(n);
        }
        int counter = 1;
        while (counter < k2) {
            if (counter > k1) {
                elementSum += minHeap.peek();
            }
            minHeap.poll();
            counter++;
        }
        return elementSum;
    }

}
