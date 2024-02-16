package patterns.topkelements.kclosestnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import static patterns.topkelements.kclosestnumbers.KBinarySearch.binarySearch;

// Time: O(logN + K)
// Space: O(1)
public class KClosestNumbers {

    public static List<Integer> findClosestElements(int[] arr, int K, int X) {
        int index = binarySearch(arr, X);
        int low = index - K, high = index + K;
        low = Math.max(low, 0); // 'low' should not be less than zero
        // 'high' should not be greater the size of the array
        high = Math.min(high, arr.length - 1);

        PriorityQueue<Entry> minHeap = new PriorityQueue<>((n1, n2) -> n1.key - n2.key);
        // add all candidate elements to the min heap, sorted by their absolute difference
        // from 'X'
        for (int i = low; i <= high; i++)
            minHeap.add(new Entry(Math.abs(arr[i] - X), i));

        // we need the top 'K' elements having smallest difference from 'X'
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < K; i++)
            result.add(arr[minHeap.poll().value]);

        Collections.sort(result);
        return result;
    }

}
