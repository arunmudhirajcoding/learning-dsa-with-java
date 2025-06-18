public class CountNQ {
    public static boolean ifSafe(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void queens(char board[][], int row) {
        if (row == board.length) {
            count++;// count instead of printing 
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

    static int count = 0;

    public static void main(String[] args) {
        int size = 5;
        char board[][] = new char[size][size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        queens(board, 0);
        if (count == 0) {
            System.out.println("no ways");
        } else {

            System.out.println("no. of possible permutations or ways are: " + count);
        }

    }
}
