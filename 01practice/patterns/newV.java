import java.util.*;
public class newV {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 1; i <=num; i++) {
            int newV =i;
            for (int j = 1; j <=i; j++) {
                System.out.print((newV++)+" ");
            }
            System.out.println();
        }
        // System.out.println();
    }
}
