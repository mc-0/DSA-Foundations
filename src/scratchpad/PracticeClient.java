package scratchpad;

import java.util.HashSet;

public class PracticeClient {


    public static void main(String[] args) {
        String s = "A man, a plan, a canal, Panama!";

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char a = s.charAt(start);
            char b = s.charAt(end);

            if (!Character.isAlphabetic(a)) {
                start++;
                continue;
            }

            
        }



    }

}
