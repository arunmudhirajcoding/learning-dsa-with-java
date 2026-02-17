public class Sudoku {
public static boolean isSafe(char sudoku[][], int row, int col, char ch) {
        
        for (int i = 0; i < 9; i++) {// horizontal
            if (sudoku[row][i] == ch) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {// vertical
            if (sudoku[i][col] == ch) {
                return false;
            }
        }
        int br = (row / 3) * 3;//imp
        int bc = (col / 3) * 3;
        for (int i = br; i < br + 3; i++) { // check in it self box
            for (int j = bc; j < bc + 3; j++) {
                if (sudoku[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSOlver(char[][] sudoku, int row, int col) {

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
        if (sudoku[row][col] != '.') {
            return sudokuSOlver(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <=9; digit++) {
            char ch = (char)(digit+'0');
            if (isSafe(sudoku, row, col, ch)) {
                sudoku[row][col] = ch;
                if (sudokuSOlver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = '.';
            }
        }
        return false;
    }

    public static void printSudoku(char sudoku[][]){
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', ' ', ' ', '7', ' ', '.'},
            {'6', ' ', ' ', '1', '9', '5', ' ', '.', '.'},
            {'.', '9', '8', ' ', '.', '.', '6', '.'},
            {'8', ' ', ' ', '6', ' ', '.', '.', '3'},
            {'4', ' ', ' ', '8', ' ', '3', ' ', '.', '1'},
            {'7', ' ', ' ', ' ', '2', ' ', '.', '.', '6'},
            {'.', ' ', ' ', '4', '1', '9', ' ', '.', '5'},
            {'.', ' ', ' ', '8', ' ', '.', '.', '7', '9'}
        };
        
        char[][] solvedBoard = sudokuSOlver(board, 0, 0) ? board.clone() : null;
        return solvedBoard;
    }
}
