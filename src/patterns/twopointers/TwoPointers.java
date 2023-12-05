package patterns.twopointers;

import java.util.Arrays;

public class TwoPointers {

    public static boolean simplePalimdrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.toLowerCase().charAt(i));
            }
        }

        int start = 0, end = sb.length() - 1;
        while (start < end) {
            if (sb.charAt(start) == sb.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int[] targetSum(int[] input, int target) {
        int[] answer = {-1,-1};
        int start = 0;
        int end = input.length - 1;

        while (start < end) {
            if (input[start] + input[end] == target) {
                answer[0] = start;
                answer[1] = end;
                return answer;
            }
            else {
                if ((input[start] + input[end]) < target) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return answer;
    }

    public static int moveDuplicates(int[] nums) {
        int nextNonDuplicate = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[nextNonDuplicate - 1] != nums[i]) {
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }

    public static int removeKeyFromUnsorted(int[] nums, int key) {
        int replaceable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != key) {
                nums[replaceable] = nums[i];
                replaceable++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return replaceable;
    }

    public static int[] squareSortedArray(int[] nums) {
        int[] squared = new int[nums.length];
        int start = 0, end = nums.length - 1;

        for (int i = nums.length - 1; i >= 0 ; i--) {
            int startSquared = (nums[start] * nums[start]);
            int endSquared = (nums[end] * nums[end]);

            if (startSquared >= endSquared) {
                squared[i] = startSquared;
                start++;
            }
            else {
                squared[i] = endSquared;
                end--;
            }
        }
        return squared;
    }
}
