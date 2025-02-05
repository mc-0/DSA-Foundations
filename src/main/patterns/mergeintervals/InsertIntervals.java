package main.patterns.mergeintervals;

import java.util.LinkedList;
import java.util.List;

public class InsertIntervals {

    public static List<Interval> insertInterval(List<Interval> intervals, Interval newInterval) {
        List<Interval> mergedIntervals = new LinkedList<>();
        int i = 0;
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            mergedIntervals.add(intervals.get(i));
            i++;
        }

        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            i++;
        }
        mergedIntervals.add(newInterval);

        while (i < intervals.size()) {
            mergedIntervals.add(intervals.get(i));
            i++;
        }

        return mergedIntervals;
    }

}
