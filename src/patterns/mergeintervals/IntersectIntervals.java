package patterns.mergeintervals;

import java.util.LinkedList;
import java.util.List;

public class IntersectIntervals {

    public static List<Interval> findIntersection(Interval[] arr1, Interval[] arr2) {
        List<Interval> result = new LinkedList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if ((arr1[i].start >= arr2[j].start && arr1[i].start <= arr2[j].end) ||
            (arr2[j].start >= arr1[i].start && arr2[j].start <= arr1[i].end)) {
                result.add(new Interval(Math.max(arr1[i].start, arr2[j].start), Math.min(arr1[i].end, arr2[j].end)));
            }

            if (arr1[i].end < arr2[j].end) {
                i++;
            }
            else {
                j++;
            }
        }
        return result;
    }


}
