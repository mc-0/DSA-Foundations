package patterns.topkelements.kclosestnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class InitialTryKClosest {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> Integer.compare(Math.abs(a - x), Math.abs(b - x)));
        for (int n : arr) {
            heap.add(n);
        }

        for (int i = 0; i < k; i++) {
            result.add(heap.poll());
        }
        Collections.sort(result);
        return result;
    }

}
