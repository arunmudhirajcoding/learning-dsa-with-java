public class Sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        
        for (int i = 0; i < 9; i++) {// horizontal
            if (sudoku[row][i] == digit) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {// vertical
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        int br = (row / 3) * 3;//imp
        int bc = (col / 3) * 3;
        for (int i = br; i < br + 3; i++) { // check in it self box
            for (int j = bc; j < bc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSOlver(int[][] sudoku, int row, int col) {

        // base case
        if (row == 9) {
            return true;
        }
        int nextRow = row, nextCol = col + 1;
        // to shift next line
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        // to not change default number
        if (sudoku[row][col] != 0) {
            return sudokuSOlver(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <=9; digit++) {

            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSOlver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudokuPuzzle = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },

                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },

                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        if (sudokuSOlver(sudokuPuzzle, 0, 0)) {
            System.out.println("solution exist");
            printSudoku(sudokuPuzzle);
        } else {
            System.out.println("no solution");
        }

    }
}
