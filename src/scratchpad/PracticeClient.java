package scratchpad;

import blind75.arrays_and_hashing.TopKFrequentElements;
import blind75.arrays_and_hashing.ValidAnagram;
import patterns.orderedset.MyCalendarI;

import java.util.*;

public class PracticeClient {

    public static void main(String[] args) {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(nums, k)));
    }
}
