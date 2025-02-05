package main.patterns.unionfind;

// Time: O(n^3) - worst case, union & find take O(n) and do up to O(n^3) comparisons
// Space: O(n) - for parent array
public class NumberOfProvinces {
    private int[] parent; // Array to store the root of each node.

    // Function to find the province count.
    public int findProvinces(int[][] isConnected) {
        int n = isConnected.length;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int numProvinces = n;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1 && find(i) != find(j)) {
                        union(i, j);
                        numProvinces--;
                }
            }
        }
        return numProvinces;
    }

    private int find(int node) {
        if (node != parent[node]) {
            parent[node] = find(parent[node]);
        }
        return parent[node];
    }

    private void union (int n1, int n2) {
        parent[find(n1)] = find(n2);
    }
}
