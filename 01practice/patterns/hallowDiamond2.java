import java.util.Scanner;

public class hallowDiamond2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int spaces = num -1;
        for (int i = 1; i <=num*2-1; i++) {
            //spaces
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            if (i<num) {
                for (int j = 1; j <2*i-1; j++) {
                    if (j==1||j==2*i-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    // System.out.println();
                }
            } else {
                for (int j = 0; j < args.length; j++) {
                    
                }
                
            }
            if (i<num) {
                spaces--;
            } else {
                spaces++;
            }
        }
    }
}
