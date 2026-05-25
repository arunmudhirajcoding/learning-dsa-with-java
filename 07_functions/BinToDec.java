import java.util.*;

public class BinToDec {
    public static int binToDec(int n){


        //method-2 using bitwise operators
        int ans = 0;
        int i = 0;
        while (n!=0) {
            int digit = n&1;
            if (digit==1) {
                ans+=digit*Math.pow(2, i);
            }
            n/=10;
            i++;
            // System.out.println();
        }



        //method-1 using number system
        // int ans = 0;
        // int i = 0;
        // while (n!=0) {
        //     int digit = n%10;
        //     ans+=digit*Math.pow(2, i);
        //     n/=10;
        //     i++;
        //     // System.out.println();
        // }
        return ans;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int bin = Sc.nextInt();
        System.out.println("the decimal number of "+bin+" is "+binToDec(bin));
    }
}
