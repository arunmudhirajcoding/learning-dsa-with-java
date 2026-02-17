import java.util.ArrayList;k9
import java.util.List;

public class ListNQ {
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

    static List<List<String>> lists = new ArrayList<>();

    public static void queens(char board[][], int row) {
        if (row == board.length) { // end of the board means all Q placed
            // printBoard(board);
            List<String> list = new ArrayList();
            for (int i = 0; i < board.length; i++) {
                list.add(new String(board[i]));
            }

            lists.add(list);
            return;
        }
        for (int col = 0; col < board.length; col++) { // travese each col
            if (ifSafe(board, row, col)) { // check to place Q
                board[row][col] = 'Q'; // place Q
                queens(board, row + 1); // check for next row
                board[row][col] = '.'; // if next row not set for Q then put prev Q -> x then go for next col
            }

        }

    }

    public static void printQueen(List<List<String>> board) {
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.get(i).size(); j++) {
                System.out.print(board.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char board[][] = new char[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        queens(board, 0);
        System.out.println(lists);
    }
}
