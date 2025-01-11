import java.util.Scanner;

/*
            * * * * *
          *       *
        *       *
      *       *
    * * * * *

 */
// out
public class i08_hallowRhombus {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num-i+; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=num; j++) {
                if(i==1||i==num||j==1||j==num){
                  System.out.print("*");
                }
                else{
                  System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

