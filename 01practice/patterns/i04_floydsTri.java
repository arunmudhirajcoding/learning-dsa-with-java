import java.util.Scanner;

// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15

public class i04_floydsTri {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int temp = 1;
        for (int row = 1; row <=num; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(temp+" ");
                temp++;
            }
            // out
            System.out.println(" ");
        }
    }    
}
