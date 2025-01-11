import java.util.Scanner;

public class plusPattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int newV = (num%2==0)?num/2:(num+1)/2;
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num; j++) {
                if (i==newV||j==newV){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // System.out.println();
            System.out.println();
        }
    }    
}
