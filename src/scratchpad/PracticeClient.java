package scratchpad;

import patterns.kwaymerge.KSmallestNumberInMSortedLists;
import patterns.topkelements.SumOfElements;
import patterns.topkelements.kclosestnumbers.KClosestNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeClient {

    public static void main(String[] args) {
        List<List<Integer>> n = new ArrayList<>();
        List<Integer> l1 = Arrays.asList(2,6,8);
        List<Integer> l2 = Arrays.asList(3,6,7);
        List<Integer> l3 = Arrays.asList(1,3,4);
        n.add(l1);
        n.add(l2);
        n.add(l3);
        KSmallestNumberInMSortedLists k = new KSmallestNumberInMSortedLists();
        System.out.println(k.findKthSmallest(n, 3));
    }



    }

