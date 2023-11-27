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
}
