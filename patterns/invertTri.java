import java.util.Scanner;

/*

* * * * *
* * * *
* * * 
* *
* 

 */

public class invertTri {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int num = Sc.nextInt();
        // System.out.println();
        // for (int line = 1; line <=num; line++) {
        //     for (int star = 1; star <=num-line+1; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //          or          //

        for (int line = 1; line <=num; line++) {
            for (int star = num; star >=line; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
