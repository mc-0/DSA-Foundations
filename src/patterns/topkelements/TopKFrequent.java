package patterns.topkelements;

import java.util.*;

// Time: O(N + N*logK)
//Space: O(N)
public class TopKFrequent {
    public List<Integer> findTopKFrequentNumbers(int[] nums, int k) {
        List<Integer> topNumbers = new ArrayList<>(k);
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<Map.Entry<Integer, Integer>>((e1, e2) -> e1.getValue() - e2.getValue());
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            heap.add(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        while (!heap.isEmpty()) {
            topNumbers.add(heap.poll().getKey());
        }
        return topNumbers;
    }
}
