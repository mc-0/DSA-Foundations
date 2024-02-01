package scratchpad;

import datastructures.graphs.FindPathInGraph;
import datastructures.graphs.Graph;
import datastructures.graphs.Pair;

public class PracticeClient {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

//        graph.DFS(2);
        int[][] x = new int[3][2];
        x[0] = new int[]{0, 1};
        x[1] = new int[]{1, 2};
        x[2] = new int[]{2, 3};
        FindPathInGraph g = new FindPathInGraph();
        System.out.println(g.hasPath(4, x, 0, 3));
    }



    }

