package main.patterns.unionfind;
// Time: O(NlogN)
// Space: O(N)
public class RedundantConnection {
    private int[] parent;

    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i; // Each node is its own parent initially
        }

        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];

            if (find(node1) == find(node2)) { // A cycle is detected
                return edge;
            }
            union(node1, node2);
        }

        return new int[2]; // If no redundant connection found, though the problem statement assures there will be one.
    }

    private int find(int node) {
        if (node != parent[node]) {
            parent[node] = find(parent[node]); // Path compression
        }
        return parent[node];
    }

    private void union(int node1, int node2) {
        parent[find(node1)] = find(node2); // Union the two sets
    }

}
