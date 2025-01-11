import java.util.Scanner;

public class prime {

    public static boolean isprime(int n){
        if (n==2) {
            return true;
        } else {
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if (n%i==0) {
                    return false;
                }
            }
            return true;
            // System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        if (isprime(num)) {
            System.out.println("the number is prime");
        } else {
            System.out.println("the number is not a prime number");
        }
        
    }
}
