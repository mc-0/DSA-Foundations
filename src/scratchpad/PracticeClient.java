package scratchpad;

import blind75.arrays_and_hashing.ValidSudoku;

public class PracticeClient {

    public static void main(String[] args) {
        String[][] input = new String[][]{{"5","3",".",".","7",".",".",".","."}
,{"6",".",".","1","9","5",".",".","."}
,{".","9","8",".",".",".",".","6","."}
,{"8",".",".",".","6",".",".",".","3"}
,{"4",".",".","8",".","3",".",".","1"}
,{"7",".",".",".","2",".",".",".","6"}
,{".","6",".",".",".",".","2","8","."}
,{".",".",".","4","1","9",".",".","5"}
,{".",".",".",".","8",".",".","7","9"}};

        ValidSudoku v = new ValidSudoku();
        System.out.println(v.isValidSudoku(input));
    }
}
