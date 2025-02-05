package main.patterns.unionfind.casestudies.unionfind;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UFClient {
    /**
        Client will print input pairs for new connections / merging of components
        It will ignore a pair that are already part of the same component
     */
    public static void main(String[] args) throws IOException {


        Scanner scan = new Scanner(new File("C:\\Projects\\DSA\\src\\inputdata\\mediumUF.txt"));
        int n = Integer.parseInt(scan.nextLine());
        QuickUnion qu = new QuickUnion(n);
        while (scan.hasNextLine()) {

            String[] ints = scan.nextLine().split(" ");
            int p = Integer.parseInt(ints[0]);
            int q = Integer.parseInt(ints[1]);

            if (qu.find(p) == qu.find(q)) continue;
            qu.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println(qu.getCount() + " components");


    }
}
