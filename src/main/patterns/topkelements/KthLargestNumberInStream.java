package main.patterns.topkelements;

import java.util.PriorityQueue;

// For Add Method:
    // Time: O(logK)
    // Space: O(K)
public class KthLargestNumberInStream {

    PriorityQueue<Integer> heap;
    int kth;

    public KthLargestNumberInStream(int[] nums, int k) {
        heap = new PriorityQueue<>((a,b) -> a - b);
        kth = k;

        for (int n : nums) {
            add(n);
        }

    }

    public int add(int num) {
        // add the new number in the min heap
        heap.add(num);

        // if heap has more than 'k' numbers, remove one number
        if (heap.size() > this.kth)
            heap.poll();

        // return the 'Kth largest number
        return heap.peek();
    }
}
