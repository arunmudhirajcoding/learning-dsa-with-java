import java.util.Scanner;

public class fact {

    public static int fact(int n){
        int f = 1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        return f;
        // System.out.println();
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Sc.nextInt();
        int factorial = fact(num);
        System.out.println(" factorial of "+num+" is "+factorial);
        
    }    
}
