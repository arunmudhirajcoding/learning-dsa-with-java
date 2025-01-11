import java.util.Scanner;

/*
          * 
        * *
      * * *
    * * * *
  * * * * *

 */
public class i02_halfLeftTri {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt(); 
        for (int row = 1; row <=num; row++) {
            for (int k = 1; k <=num-row; k++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            // System.out.println();
            System.out.println(" ");
        }
    }
}
