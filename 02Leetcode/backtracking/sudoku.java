public class sudoku {

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // horizontal
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }
        // vertical
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // self box
        int intRow = (row / 3) * 3;
        int intCol = (col / 3) * 3;
        for (int i = intRow; i <intRow+ 3; i++) {
            for (int j = intCol; j <intCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSOlver(int[][] sudokuPuzzle, int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextCol = 0;
            nextRow = row + 1;
        }
        if (sudokuPuzzle[row][col] != 0) {
            return sudokuSOlver(sudokuPuzzle, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudokuPuzzle, row, col, digit)) {
                sudokuPuzzle[row][col] = digit;
                if (sudokuSOlver(sudokuPuzzle, nextRow, nextCol)) {
                    return true;
                }
                sudokuPuzzle[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int[][] sudokuPuzzle) {
        for (int i = 0; i < sudokuPuzzle.length; i++) {
            for (int j = 0; j < sudokuPuzzle.length; j++) {
                System.out.print(sudokuPuzzle[i][j] + " ");
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
            printSudoku(sudokuPuzzle);
            System.out.println("this is solution for it");
        } else {
            System.out.println("there is no solution");
        }
    }
}
