import java.util.*;
public class Diamond {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >=1; i--) {
            for (int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1; j++) {
                System.out.print("*");
            }
            // System.out.println();
            System.out.println();
        }
        
    }
}
