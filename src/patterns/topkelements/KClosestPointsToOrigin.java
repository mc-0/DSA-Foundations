package patterns.topkelements;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// Time: O(N*logK)
// Space: O(K)
public class KClosestPointsToOrigin {

    public static List<Point> findClosestPoints(Point[] points, int k) {
        // NOTE: COMPARATOR ALLOWS THE PRIORITY QUEUE TO KNOW HOW TO ORDER V V V
        PriorityQueue<Point> heap = new PriorityQueue<>((p1, p2) -> p2.distFromOrigin() - p1.distFromOrigin());
        for (int i = 0; i < k; i++) {
            heap.add(points[i]);
        }

        for (int i = k; i < points.length; i++) {
            if (points[i].distFromOrigin() < heap.peek().distFromOrigin()) {
                heap.poll();
                heap.add(points[i]);
            }
        }
        return new ArrayList<>(heap);
    }

}
