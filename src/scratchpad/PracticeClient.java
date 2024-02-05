package scratchpad;

import patterns.matrixtraversal.BiggestIsland;
import patterns.matrixtraversal.ClosedIslands;
import patterns.matrixtraversal.CountIslandsDFS;
import patterns.matrixtraversal.FloodFill;
import patterns.util.Helper;

public class PracticeClient {

    public static void main(String[] args) {
        int[][] n = {{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,1,1,0},
                {0,0,1,0,0},
                {0,0,0,0,0}};

        System.out.println(ClosedIslands.countClosedIslands(n));

    }



    }

