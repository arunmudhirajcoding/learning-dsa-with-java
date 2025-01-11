import java.util.Scanner;

/*

    *****
   *****
  *****
 *****
*****

 */

public class i07_solidRhombus {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 1; i <=num; i++) {
            //spaces
            for (int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=num; j++) {
                System.out.print("*");
            }
            
            // for (int j = 1; j <=num-1; j++) {
            //     if ((i+j)<=num+1) {
            //         System.out.print(" ");
            //     }
            // }
            // System.out.println();
            // for (int j = 1; j <=num; j++) {
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }    
}
