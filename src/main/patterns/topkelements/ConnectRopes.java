package main.patterns.topkelements;

import java.util.PriorityQueue;

// Time: O(N*LogN)
// Space: O(N)
public class ConnectRopes {

    public static int minimumCostToConnectRopes(int[] ropeLengths) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : ropeLengths) {
            minHeap.add(n);
        }

        int result = 0, temp = 0;
        while (minHeap.size() > 1) {
            temp = minHeap.poll() + minHeap.poll();
            result += temp;
            minHeap.add(temp);
        }

        return result;
    }

}
