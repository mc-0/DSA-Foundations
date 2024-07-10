package blind75.arrays_and_hashing;

import java.util.*;

// 36. Valid Sudoku
public class ValidSudoku {
    public boolean isValidSudoku(String[][] board) {
        Set<String> seen = new HashSet<>();

        for(int r = 0; r < board.length; r++) {
            for (int c = 0; c < board.length; c++) {
                String currentNumber = board[r][c];
                if (!currentNumber.equals(".")) {
                    if (!seen.add(currentNumber + " in row " + r) ||
                            !seen.add(currentNumber + " in column " + c) ||
                            !seen.add(currentNumber + " in square " + r/3 + "-" + c/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
