import java.util.*;
public class palindromPattern {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        // System.out.println();
    }
}