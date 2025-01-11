import java.util.Scanner;

/*

 * * * * *      
 *       *      
 *       *      
 *       *      
 * * * * *

 */
// out
public class i01_sq {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Sc.nextInt();
        for (int row = 1; row <=num; row++) {
            // if (row==1 || row ==num) {
            //     for (int col = 1; col <=num; col++) {
            //         System.out.print("*");
            //     }
            //     System.out.println( );
            // } else {
            //     for (int col = 1; col <=num; col++) {
            //         if (col>1&&col<num) {
            //             System.out.print(" ");
            //         }
            //         else{
            //             System.out.print("*");
            //         }
            //     }
            //     System.out.println();
            // }
            for (int col = 1; col <=num; col++) {
                if (row==1||row==num||col==1||col==num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}