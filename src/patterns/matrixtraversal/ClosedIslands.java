package patterns.matrixtraversal;

// Time: O(M * N)
// Space: O(M * N)
public class ClosedIslands {

    public static int countClosedIslands(int[][] matrix) {
        int rows = matrix.length; // The # of sub-arrays in the matrix
        int cols = matrix[0].length; // The length of the sub-arrays in the matrix
        boolean[][] visited = new boolean[rows][cols];
        int islandCount = 0;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    if (recursiveDFS(matrix, i, j, visited)) {
                        islandCount++;
                    }
                }
            }
        }
        return islandCount;
    }

    private static boolean recursiveDFS(int[][] matrix, int x, int y, boolean[][] visited) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
            return false;
        }
        if (matrix[x][y] == 0 || visited[x][y]) {
            return true;
        }

        visited[x][y] = true;

        boolean isClosed = true;
        isClosed &= recursiveDFS(matrix, x + 1, y, visited);
        isClosed &= recursiveDFS(matrix, x - 1, y, visited);
        isClosed &= recursiveDFS(matrix, x, y + 1, visited);
        isClosed &= recursiveDFS(matrix, x, y - 1, visited);

        return isClosed;

    }

}
