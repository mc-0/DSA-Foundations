package scratchpad;

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

        System.out.print("Vertices: ");
        for (int vertex : graph.getVertices()) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        System.out.print("Edges: ");
        for (Pair<Integer, Integer> edge : graph.getEdges()) {
            System.out.print("(" + edge.getFirst() + ", " + edge.getSecond() + ") ");
        }
        System.out.println();

        System.out.print("Neighbors of vertex 1: ");
        for (int neighbor : graph.getNeighbors(1)) {
            System.out.print(neighbor + " ");
        }
        System.out.println();

        System.out.println("Is vertex 1 adjacent to vertex 2? " + graph.isAdjacent(1, 2));

        graph.removeEdge(1, 2);
        graph.removeVertex(3);

        System.out.println("After removing some edges and vertices:");

        System.out.print("Vertices: ");
        for (int vertex : graph.getVertices()) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        System.out.print("Edges: ");
        for (Pair<Integer, Integer> edge : graph.getEdges()) {
            System.out.print("(" + edge.getFirst() + ", " + edge.getSecond() + ") ");
        }
        System.out.println();
    }



    }

