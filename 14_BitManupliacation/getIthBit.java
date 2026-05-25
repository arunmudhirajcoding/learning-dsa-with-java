import java.util.Scanner;

public class getIthBit {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if ((n&(1<<i-1))==0) {
            System.out.println("the ith bit is 0");
        } else {
            System.out.println("the ith bit is 1");
            
        }

        int v = sc.nextInt();
        n = n & ~(1<<i-1);
        
        System.out.println("what "+ (n | (v<<i-1)));
    }
}
