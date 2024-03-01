package scratchpad;

import patterns.topologicalsort.TasksSchedulingOrder;
import patterns.trie.IndexStrings;
import patterns.unionfind.UnionFind;

import java.util.ArrayList;
import java.util.List;

public class PracticeClient {

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(6);
        int[][] e = {{1,2}, {1,3}, {3,4}, {1,4}, {1,5}};
        for (int[] pair : e) {
            uf.union(pair[0], pair[1]);
        }

        uf.getRank(1);
        uf.getRank(2);
        uf.getRank(3);
        uf.getRank(4);
        uf.getRank(5);

    }



    }

