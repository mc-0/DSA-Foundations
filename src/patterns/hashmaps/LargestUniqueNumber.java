package patterns.hashmaps;

import java.util.HashMap;

public class LargestUniqueNumber {

    public static int findLargest(int[] A) {
        int largest = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for (int key : map.keySet()) {
            int currentValue = map.get(key);
            if (currentValue == 1 && key > largest) {
                largest = key;
            }
        }
        return largest == Integer.MIN_VALUE ? -1 : largest;
    }
}
