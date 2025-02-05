package main.patterns.topkelements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
// Time: O(N*logK)
// Space: O(K)
public class TopKNumbers {

    public static List<Integer> findKLargestNumbers(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
        for (int n : nums) {
            heap.add(n);
        }
        List<Integer> result = new ArrayList<>();
        int count = k;
        while (count > 0) {
            result.add(heap.poll());
            count--;
        }

        return result;
    }

}
