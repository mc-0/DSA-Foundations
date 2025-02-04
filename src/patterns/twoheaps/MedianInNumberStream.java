package patterns.twoheaps;

import java.util.PriorityQueue;

// Space: O(n) - Have to store all the numbers
public class MedianInNumberStream {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianInNumberStream() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>((a, b) -> a - b);
    }

    // Time: O(logN)
    public void insertNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.offer(num);
        }
        else {
            minHeap.offer(num);
        }

        // either both the heaps will have equal number of elements or max-heap will have one
        // more element than the min-heap
        if (maxHeap.size() > minHeap.size() + 1)
            minHeap.add(maxHeap.poll());
        else if (maxHeap.size() < minHeap.size())
            maxHeap.add(minHeap.poll());
  }

  // Time: O(1)
  public  double findMedian() {
      if (maxHeap.size() == minHeap.size()) {
          // we have even number of elements, take the average of middle two elements
          return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
      }
      // because max-heap will have one more element than the min-heap
      return maxHeap.peek();
  }
}
