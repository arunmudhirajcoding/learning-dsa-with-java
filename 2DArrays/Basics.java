import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // in other languages 2d arrays are stored in col major or row major 
        // but in java 2d arrays are stored like:
        // 

        //creation of 2d array
        int matrix[][] = new int[2][2];
        // accessing the length of matrix
        int row = matrix.length, col = matrix[0].length;
        
        //input elements
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //printing elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // searching max and min element
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                min = Math.min(min, matrix[i][j]);
                max = Math.max(max, matrix[i][j]);
            }
        }
        System.out.println(min+" "+max);
    }
}
