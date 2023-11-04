package patterns.twopointers;

import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

    public static void main(String[] args) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        String test = "DesignGUrus";

        char[] input = test.toCharArray();

        int start = 0;
        int end = test.length() - 1;
        while (start < end) {
            if (vowels.contains(input[start]) && vowels.contains(input[end])) {
                swap(input, start, end);
                start++;
                end--;
            }
            if (!vowels.contains(input[start])) {
                start++;
            }

            if (!vowels.contains(input[end])) {
                end--;
            }
        }

        String result = new String(input);
        System.out.println(result);


    }

    public static void swap(char[] s, int start, int end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

    }
}
