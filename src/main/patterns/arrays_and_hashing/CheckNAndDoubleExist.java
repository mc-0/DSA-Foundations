package main.patterns.arrays_and_hashing;

import java.util.HashSet;

// 1346. Check If N and Its Double Exist
public class CheckNAndDoubleExist {
    /*
    * Similar to 2Sum: Use HashMap to see if compliment has been seen
    * Either a number twice its size or (if possible) is divisible by 2
    * Time: O(n)
    * Space: O(n)
    */

    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            else {
                set.add(num);
            }
        }
        return false;
    }


}
