import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int matrix[][] = new int[2][2];
        // accessing the length of matrix
        int row = matrix.length, col = matrix[0].length;

        // input elements
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // printing elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // 0,0     0,1      1,0         1,1 
        //  0       1        2           3
        // 0/3,0%3 0/3,1%3  1/3,0%3    1/3,1%3
    }
}
