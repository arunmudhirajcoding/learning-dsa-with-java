import java.util.Scanner;

public class getIthBit {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if ((n&(1<<i))==0) {
            System.out.println("the ith bit is 0");
        } else {
            System.out.println("the ith bit is 1");
            
        }
    }
}
