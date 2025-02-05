package main.patterns.topkelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaximumDistinctElements {

    public static int findMaximumDistinctElements(int[] nums, int k) {
        int distinctElementsCount = 0;
        if (nums.length <= k)
            return distinctElementsCount;

        // find the frequency of each number
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for (int i : nums)
            numFrequencyMap.put(i, numFrequencyMap.getOrDefault(i, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<Map.Entry<Integer, Integer>>();

        // insert all numbers with frequency greater than '1' into the min-heap
        for (Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            if (entry.getValue() == 1)
                distinctElementsCount++;
            else
                minHeap.add(entry);
        }

        // following a greedy approach, try removing the least frequent numbers first from
        // the min-heap
        while (k > 0 && !minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = minHeap.poll();
            // to make an element distinct, we need to remove all of its occurrences except one
            k -= entry.getValue() - 1;
            if (k >= 0)
                distinctElementsCount++;
        }

        // if k > 0, this means we have to remove some distinct numbers
        if (k > 0)
            distinctElementsCount -= k;

        return distinctElementsCount;
    }

}
