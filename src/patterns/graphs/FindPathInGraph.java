package patterns.graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class FindPathInGraph {
    boolean[] visited;

    public boolean hasPath(int n, int[][] edges, int source, int destination) {
        this.visited = new boolean[n];
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        for(int[] edge : edges) {
            int e = edge[0];
            int neighbor = edge[1];
            if (adjList.containsKey(e)) {
                adjList.get(e).add(neighbor);
            }
            else {
                ArrayList<Integer> i = new ArrayList<>();
                i.add(neighbor);
                adjList.put(e, i);
            }

            if (adjList.containsKey(neighbor)) {
                adjList.get(neighbor).add(e);
            }
            else {
                ArrayList<Integer> i = new ArrayList<>();
                i.add(e);
                adjList.put(neighbor, i);
            }
        }

        return recursiveDFS(adjList, visited, source, destination);
    }

    public static boolean recursiveDFS(HashMap<Integer, ArrayList<Integer>> adjList, boolean[] visited, int start, int end) {
        ArrayList<Integer> neighbors = adjList.get(start);
        if (start == end) {
            return true;
        }
        visited[start] = true;

        for (int neighbor : neighbors) {
            if (!visited[neighbor] && recursiveDFS(adjList, visited, neighbor, end)) {
                return true;
            }
        }
        return false;
    }
}
