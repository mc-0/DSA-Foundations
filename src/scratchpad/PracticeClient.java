package scratchpad;

import patterns.topologicalsort.TasksSchedulingOrder;
import patterns.trie.IndexStrings;

import java.util.ArrayList;
import java.util.List;

public class PracticeClient {

    public static void main(String[] args) {
        int[][] n =  {{2,5}, {0,5},{0,4},{1,4},{3,2}, {1,3}};
        int t = 6;
        int[] i = new int[0];
        TasksSchedulingOrder schedulingOrder = new TasksSchedulingOrder();
        System.out.println(schedulingOrder.findOrder(t,n));

    }



    }

