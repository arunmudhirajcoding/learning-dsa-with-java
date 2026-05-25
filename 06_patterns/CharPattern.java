import java.util.Scanner;

/*
    A
    B C
    D E F
    G H I J
    K L M N O

 */

public class CharPattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = Sc.nextInt();
        // System.out.println();
        // int temp = 'A';
        // for (int row = 'A'; row <='A'+num; row++) {
        //     for (int col = 'A'; col <=row; col++) {
        //         System.out.print((temp));
        //         temp++;
        //     }

        //     System.out.println();
        // }

        //      or      //

        int temp = 65;
        
        for (int row = 1; row <=num; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print((char)(temp));
                temp++;
            }

            System.out.println();
        }
    }
}
