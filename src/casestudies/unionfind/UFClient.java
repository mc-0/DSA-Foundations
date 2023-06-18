package casestudies.unionfind;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class UFClient {
    /**
        Client will print input pairs for new connections / merging of components
        It will ignore a pair that are already part of the same component
     */
    public static void main(String[] args) throws IOException {


        Scanner scan = new Scanner(new File("C:\\Projects\\DSA\\src\\mediumUF.txt"));
        int n = Integer.parseInt(scan.nextLine());
        QuickFind qf = new QuickFind(n);
        while (scan.hasNextLine()) {

            String[] ints = scan.nextLine().split(" ");
            int p = Integer.parseInt(ints[0]);
            int q = Integer.parseInt(ints[1]);

            if (qf.find(p) == qf.find(q)) continue;
            qf.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println(qf.getCount() + " components");


    }
}
