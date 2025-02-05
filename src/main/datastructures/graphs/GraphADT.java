package main.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public interface GraphADT {

    void addVertex(int vertex);
    // Add a new vertex to the graph.

    void removeVertex(int vertex);
    // Remove a vertex from the graph.

    void addEdge(int vertex1, int vertex2);
    // Add an edge between two vertices.

    void removeEdge(int vertex1, int vertex2);
    // Remove an edge between two vertices.

    ArrayList<Integer> getVertices();
    // Get a list of all vertices.

    boolean isAdjacent(int vertex1, int vertex2);
    // Check if two vertices are adjacent.

    int getVertexCount();
    // Get the total number of vertices.

    int getEdgeCount();
    // Get the total number of edges.

    List<Pair<Integer, Integer>> getEdges();
    // Get a list of all edges.

    ArrayList<Integer> getNeighbors(int vertex);
    // Get a list of neighbors of a given vertex.
}
