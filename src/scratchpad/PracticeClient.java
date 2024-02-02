package scratchpad;

import datastructures.graphs.FindPathInGraph;
import datastructures.graphs.Graph;
import datastructures.graphs.Pair;

public class PracticeClient {

    public static void main(String[] args) {
        Graph graph = new Graph(); // Create a graph with 6 vertices

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        System.out.println("Breadth-First Traversal starting from vertex 0:");
        graph.BFS(5);
    }



    }

