package loops;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        // Write a program that reads a set of integers,and then prints the sum of the even and odd integers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even=0,odd=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                even+=i;
            }
            else
            {
                odd+=i;
            }
// System.out.println();
        }
        System.out.println("even "+even+"\nodd "+odd);

    }
}
