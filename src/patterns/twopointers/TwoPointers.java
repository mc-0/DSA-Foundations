package patterns.twopointers;

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
}
