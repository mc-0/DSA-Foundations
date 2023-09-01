package scratchpad;

import java.util.HashSet;

public class PracticeClient {


    public static void main(String[] args) {
        int x = 0;

        if (x >= 0) {
            try {
                System.out.println("TRY");
                System.exit(0);
            }
            finally {
                System.out.println("FINALLY");
            }
        }

    }

}
