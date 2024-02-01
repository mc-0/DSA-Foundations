package datastructures.graphs;

import java.util.*;

public class Graph implements GraphADT{

    private HashSet<Integer> visited = new HashSet<>();
    private HashMap<Integer, ArrayList<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    @Override
    public void addVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new ArrayList<>());
        }
    }

    @Override
    public void removeVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            return;
        }
        adjacencyList.remove(vertex);
        for (List<Integer> neighbors : adjacencyList.values()) {
            neighbors.removeIf(v -> v == vertex);
        }
    }

    @Override
    public void addEdge(int vertex1, int vertex2) {
        adjacencyList.computeIfAbsent(vertex1, k -> new ArrayList<>()).add(vertex2);
        adjacencyList.computeIfAbsent(vertex2, k -> new ArrayList<>()).add(vertex1);
    }

    @Override
    public void removeEdge(int vertex1, int vertex2) {
        adjacencyList.get(vertex1).removeIf(v -> v == vertex2);
        adjacencyList.get(vertex2).removeIf(v -> v == vertex1);
    }

    @Override
    public ArrayList<Integer> getVertices() {
        return new ArrayList<>(adjacencyList.keySet());
    }

    @Override
    public boolean isAdjacent(int vertex1, int vertex2) {
        List<Integer> neighbors = adjacencyList.getOrDefault(vertex1, new ArrayList<>());
        return neighbors.contains(vertex2);
    }

    @Override
    public int getVertexCount() {
        return adjacencyList.size();
    }

    @Override
    public int getEdgeCount() {
        int count = 0;
        for (List<Integer> neighbors : adjacencyList.values()) {
            count += neighbors.size();
        }
        return count / 2;
    }

    @Override
    public List<Pair<Integer, Integer>> getEdges() {
        List<Pair<Integer, Integer>> edges = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : adjacencyList.entrySet()) {
            int vertex1 = entry.getKey();
            for (int neighbor : entry.getValue()) {
                int vertex2 = neighbor;
                if (vertex1 < vertex2) {
                    edges.add(new Pair<>(vertex1, vertex2));
                }
            }
        }
        return edges;
    }

    @Override
    public ArrayList<Integer> getNeighbors(int vertex) {
        return new ArrayList<>(adjacencyList.getOrDefault(vertex, new ArrayList<>()));
    }

    public void DFS(int source) {
        System.out.println("Node: " + source);
        visited.add(source);

        System.out.println("Visited: " + Arrays.asList(visited.toArray()));
        ArrayList<Integer> neighbors = getNeighbors(source);
        for (int i : neighbors){
            if (!visited.contains(i)) {
                DFS(i);
            }
        }
    }

}
