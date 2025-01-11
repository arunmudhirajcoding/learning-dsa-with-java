import java.util.Scanner;

/*
        1
       222
      33333
     4444444
    555555555

 */

public class preDiamond {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int row = 1; row <=num; row++) {
            for (int j = 1; j <=num-row; j++) {
        
                System.out.print(" ");
            }
            // System.out.println();
            for (int j = 1; j <=(row*2-1); j++) {
                System.out.print(row);
            }
            System.out.println(" ");
        }
        
    }    
}
