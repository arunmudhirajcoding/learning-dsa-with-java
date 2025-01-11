import java.util.Scanner;

/*

1 2 3 4 5
1 2 3 4 
1 2 3 
1 2 
1 

 */

public class i03_invertHalfPyramid {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int row = 1; row <=num; row++) {
            for (int col = 1; col <=num-row+1; col++) {
                System.out.print(col);
            }
            // System.out.println();
            System.out.println(" ");
        }
    }
}
