package patterns.matrixtraversal;

public class CountIslandsDFS {

    public static int countIslands(int[][] matrix) {
        int rows = matrix.length; // The # of sub-arrays in the matrix
        int cols = matrix[0].length; // The length of the sub-arrays in the matrix
        int totalIslands = 0; // The result: the # of islands we find

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    totalIslands++;
                    visitIslandDFS(matrix, i, j);
                }
            }
        }
        return totalIslands;
    }

    private static void visitIslandDFS(int[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
            return; // Return if cell is invalid / out of range
        }
        if (matrix[x][y] == 0) {
            return; // Return if cell is 'water' denoted by 0
        }

        matrix[x][y] = 0;

        // visit cells in each direction from current cell
        visitIslandDFS(matrix, x + 1, y);
        visitIslandDFS(matrix, x - 1, y);
        visitIslandDFS(matrix, x, y + 1);
        visitIslandDFS(matrix, x, y - 1);
    }
}
