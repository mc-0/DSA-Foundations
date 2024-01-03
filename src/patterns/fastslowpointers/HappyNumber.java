package patterns.fastslowpointers;

import java.util.HashSet;

public class HappyNumber {


    public static boolean findHappyNumber(int num) {
        int slow = num, fast = num;
        do {
            slow = calculateSquaredSum(slow);
            fast = calculateSquaredSum(calculateSquaredSum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private static int calculateSquaredSum(int num) {
        int squaredSum = 0;
        while (num > 0) {
            int currentDigit = num % 10;
            squaredSum += (currentDigit * currentDigit);
            num /= 10;
        }
        return squaredSum;
    }

    public static boolean bruteForceFindHappy(int num) {
        HashSet<Integer> nums = new HashSet<>();
        int currentNum = num;
        while (currentNum != 1) {
            if (nums.contains(currentNum)) {
                return false;
            }
            else {
                nums.add(currentNum);
                currentNum = calculateSquaredSum(currentNum);
            }
        }
        return true;
    }
}
