package patterns.mergeintervals;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

    // Time: O(N * logN)
    // Space: O(N)
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> mergedIntervals = new LinkedList<>();
        if (intervals.size() < 2) {
            return intervals;
        }

        intervals.sort(Comparator.comparingInt(a -> a.start));
        Iterator<Interval> iterator = intervals.iterator();
        Interval interval = iterator.next();
        int start = interval.start;
        int end = interval.end;

        while (iterator.hasNext()) {
            Interval nextInterval = iterator.next();
            if (nextInterval.start <= end) {
                end = Math.max(nextInterval.end, end);
            }
            else {
              mergedIntervals.add(new Interval(start, end));
              start = nextInterval.start;
              end = nextInterval.end;
            }
        }
        mergedIntervals.add(new Interval(start, end));
        return mergedIntervals;
    }

    // Implement but using array input & result
    public static int[][] merge(int[][] intervals) {
        return new int[0][0];
    }
}
