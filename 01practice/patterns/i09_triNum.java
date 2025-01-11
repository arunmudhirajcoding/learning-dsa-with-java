import java.util.Scanner;

public class i09_triNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
            int newV = 1;
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print(newV);
                if(j<i){
                    newV++;
                }
                else{
                    newV--;
                }
                // System.out.println();
            }
            System.out.println();
        }
    }
}
