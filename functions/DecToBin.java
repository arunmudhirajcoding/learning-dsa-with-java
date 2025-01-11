import java.util.*;

public class DecToBin {
    public static int decToBin(int n){
        int ans = 0;
        int i = 0;
        while (n!=0) {
            int digit = n%2;
            ans+=digit*Math.pow(10, i);
            n/=2;
            i++;
        }
        // System.out.println();
        return ans;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int dec = Sc.nextInt();
        System.out.println("the decimal number of "+dec+" is "+decToBin(dec));
    }
}
