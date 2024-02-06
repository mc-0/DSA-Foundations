package patterns.matrixtraversal;

public class IslandPerimeter {

    public static int calculateIslandSize(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int islandPerimeter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    islandPerimeter += getPerimeter(grid, i, j, visited);
                }
            }
        }
        return islandPerimeter;
    }

    private static int getPerimeter(int[][] matrix, int x, int y, boolean[][] visited) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
            return 1;
        }
        if (matrix[x][y] == 0) {
            return 1;
        }
        if (visited[x][y]) {
            return 0;
        }

        visited[x][y] = true;
        int edgeCount = 0;

        edgeCount += getPerimeter(matrix, x + 1, y, visited);
        edgeCount += getPerimeter(matrix, x - 1, y, visited);
        edgeCount += getPerimeter(matrix, x, y + 1, visited);
        edgeCount += getPerimeter(matrix, x, y - 1, visited);

        return edgeCount;


    }
}
