package patterns.graphs;

// Time: O(n^2)
// Space: O(n)
public class NumberOfProvinces {
    public static int findProvinces(int[][] isConnected) {
        int numProvinces = 0; // Count the number of provinces to return
        boolean[] visited = new boolean[isConnected.length]; // Each sub-array represents connections to other nodes

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                recurseDFS(isConnected, visited, i);
                numProvinces++;
            }
        }
        return numProvinces;
    }

    private static void recurseDFS(int[][] isConnected, boolean[] visited, int i) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                recurseDFS(isConnected, visited, j);
            }
        }
    }
}
