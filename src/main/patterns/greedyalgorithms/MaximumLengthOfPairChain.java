package main.patterns.greedyalgorithms;

import java.util.Arrays;
import java.util.PriorityQueue;

// Time: O(n*logn)
// Space: O(n)
public class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        // Sort pairs based on their second element
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        // Initialize variables
        int currentEnd = Integer.MIN_VALUE;
        int chainCount = 0;

        // Iterate through the pairs
        for (int[] pair : pairs) {
            if (pair[0] > currentEnd) {
                // Update currentEnd and increment chainCount
                currentEnd = pair[1];
                chainCount++;
            }
        }

        return chainCount;
    }


    // My own initial implementation*
    public static int findLongestChainWithQueue(int[][] pairs) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int[] i : pairs) {
            queue.add(i);
        }
        int[] current = queue.poll();
        int count = 1;
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            if (current[1] < temp[0]) {
                count++;
                current = temp;
            }
        }
        return count;
    }
}
