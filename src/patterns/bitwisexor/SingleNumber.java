package patterns.bitwisexor;

import java.util.Arrays;

public class SingleNumber {

    public static int findSingleNumber(int[] arr) {
        int num = 0; // Initialize a variable to store the result
        for (int i = 0; i < arr.length; i++) {
            num = num ^ arr[i]; // Use XOR operation to find the single number
        }
        return num; // Return the found single number
    }

}
