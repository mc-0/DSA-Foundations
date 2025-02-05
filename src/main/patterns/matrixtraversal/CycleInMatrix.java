package main.patterns.matrixtraversal;

public class CycleInMatrix {

    // Time: O(M*N)
    // Space: O(M*N)
    public static boolean hasCycle(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    if (containsCycleDFS(grid, i, j, grid[i][j], visited, -1, -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean containsCycleDFS(char[][] matrix, int x, int y, char startChar, boolean[][] visited, int prevX, int prevY) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
            return false;
        }
        if (matrix[x][y] != startChar) {
            return false;
        }

        if (visited[x][y]){
            return true;
        }
        visited[x][y] = true;

        if (x + 1 != prevX && containsCycleDFS(matrix, x + 1, y, startChar, visited, x, y)) {
            return true;
        }
        if (x - 1 != prevX && containsCycleDFS(matrix, x - 1, y, startChar, visited, x, y)) {
            return true;
        }
        if (y + 1 != prevY && containsCycleDFS(matrix, x, y + 1, startChar, visited, x, y)) {
            return true;
        }
        if (y - 1 != prevY && containsCycleDFS(matrix, x, y - 1, startChar, visited, x, y)) {
            return true;
        }
        return false;
    }
}
