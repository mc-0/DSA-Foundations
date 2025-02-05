package main.patterns.arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// 448. Find All Numbers Disappeared in an Array
public class DisappearedNumInArray {

    /*
    * Knowing the range is [1,n] we can put all input values into a set,
    * then go through the range, adding ones not present
    * Time: O(n)
    * Space: O(n)
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) res.add(i);
        }

        return res;
    }

}
