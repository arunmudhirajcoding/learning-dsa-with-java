public class nQueens {

    //tc = O(n!)
    

    public static boolean ifSafe(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {// vertical up check row decrease
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {// diagonal left up check row & col decrease
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {// diagonal right up check row decrease & col increases
                return false;
            }
        }
        return true;
    }

    public static void queens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (ifSafe(board, row, col)) {
                board[row][col] = 'Q';
                queens(board, row + 1);
                board[row][col] = 'x';
            }

        }

    }

    public static void printBoard(char board[][]) {
        System.out.println("======chess board=====");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 4;
        char board[][] = new char[size][size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        queens(board, 0);

    }
}