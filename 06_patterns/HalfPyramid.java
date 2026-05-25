import java.util.Scanner;

/*
* * * * *
  * * * *
    * * *
      * *
        *
 */

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        // System.out.println();
        // for (int row = 0; row <=num-1; row++) {
        //     for (int i = 0; i <row; i++) {
        //         System.out.print(" ");
        //     }
        //     for(int col =num ; col>row ; col--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // easy for all 
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num; j++) {
                if (i-j>0) {
                    System.out.print(" ");
                }
                if (i-j<=0) {
                    
                    System.out.print("*");
                }
            }
                System.out.println();
        }
        
    }    
}
