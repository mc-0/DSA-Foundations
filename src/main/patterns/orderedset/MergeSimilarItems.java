package main.patterns.orderedset;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Time: O(NlogN)
// Space: O(N)
public class MergeSimilarItems {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> os = new TreeMap<>();
        for (int[] item: items1) {
            os.put(item[0], os.getOrDefault(item[0], 0) + item[1]);
        }

        for (int[] item: items2) {
            os.put(item[0], os.getOrDefault(item[0], 0) + item[1]);
        }

        for (Map.Entry<Integer, Integer> entry : os.entrySet()) {
            List<Integer> currList = new ArrayList<>();
            currList.add(entry.getKey());
            currList.add(entry.getValue());
            result.add(currList);
        }

        return result;
    }

}
