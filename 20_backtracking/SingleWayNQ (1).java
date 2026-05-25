public class SingleWayNQ {

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

    public static boolean queens(char board[][], int row) {
        if (row == board.length) {
            return true;
        }
        for (int col = 0; col < board.length; col++) {
            if (ifSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (queens(board, row + 1)) {
                    return true;//if sol found , just return it 
                }
                board[row][col] = 'x';

            }

        }
        return false;

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

        if (queens(board, 0)) {
            System.out.println("the possible way is");
            printBoard(board);
        } else {

            System.out.println("No ways");
        }

    }
}
