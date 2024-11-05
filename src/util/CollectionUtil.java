package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CollectionUtil {

    public static int[] populateArray(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int [] list = new int [1000];
        int i = 0;
        while(scanner.hasNextInt()){
            list[i++] = scanner.nextInt();
        }
        return list;
    }

    public static void printFormattedArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int j : a) {
            sb.append(j).append(" ");
            if (j % 30 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
