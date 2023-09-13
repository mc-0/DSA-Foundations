package sorting.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InitInput {

    public static int[] populateArray(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int [] list = new int [1000];
        int i = 0;
        while(scanner.hasNextInt()){
            list[i++] = scanner.nextInt();
        }
        return list;
    }
}
