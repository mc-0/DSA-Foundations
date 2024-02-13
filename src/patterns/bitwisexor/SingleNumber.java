package patterns.bitwisexor;

import java.util.Arrays;

// Time: O(n)
// Space: O(1)
public class SingleNumber {

    public static int findSingleNumber(int[] nums) {
        int num = 0; // Initialize a variable to store the result
        for (int j : nums) {
            num = num ^ j; // Use XOR operation to find the single number
        }
        return num; // Return the found single number
    }

}
