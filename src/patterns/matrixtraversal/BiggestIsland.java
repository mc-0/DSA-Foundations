package patterns.matrixtraversal;

public class BiggestIsland {

    public static int countIslands(int[][] matrix) {
        int rows = matrix.length; // The # of sub-arrays in the matrix
        int cols = matrix[0].length; // The length of the sub-arrays in the matrix
        int biggestIsland = 0; // The result: the # of islands we find

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    biggestIsland = Math.max(biggestIsland, visitIslandDFS(matrix, i, j));
                    ;
                }
            }
        }
        return biggestIsland;
    }

    private static int visitIslandDFS(int[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
            return 0; // Return if cell is invalid / out of range
        }
        if (matrix[x][y] == 0) {
            return 0; // Return if cell is 'water' denoted by 0
        }

        matrix[x][y] = 0;

        int currentArea = 1; // We're on a cell marked as land;

        // visit cells in each direction from current cell
        currentArea += visitIslandDFS(matrix, x + 1, y);
        currentArea += visitIslandDFS(matrix, x - 1, y);
        currentArea += visitIslandDFS(matrix, x, y + 1);
        currentArea += visitIslandDFS(matrix, x, y - 1);
        return currentArea;
    }

}
