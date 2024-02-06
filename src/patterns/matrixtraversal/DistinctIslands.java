package patterns.matrixtraversal;

import java.util.HashSet;

// Time: O(M*N)
// Space: O(M*N)
public class DistinctIslands {

    public static int findDistinctIslands(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        HashSet<String> distinctIslands = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                StringBuilder islandScanner = new StringBuilder();
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    scanIsland(matrix, i, j, visited, islandScanner, "O");
                    distinctIslands.add(islandScanner.toString());
                }
            }
        }

        return distinctIslands.size();
    }

    private static void scanIsland(int[][] matrix, int x, int y, boolean[][] visited, StringBuilder islandScanner, String direction) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
            return;
        }
        if (matrix[x][y] == 0 || visited[x][y]) {
            return;
        }

        visited[x][y] = true;
        islandScanner.append(direction);

        scanIsland(matrix,x + 1,y, visited, islandScanner, "D");
        scanIsland(matrix,x - 1,y, visited, islandScanner,  "U");
        scanIsland(matrix,x,y + 1, visited, islandScanner,  "R");
        scanIsland(matrix,x,y - 1, visited, islandScanner, "L");

        islandScanner.append("B");

    }

}
