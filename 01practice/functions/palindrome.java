import java.util.*;

public class palindrome {
    public static int reverse(int n){
        int ans = 0;
        while (n!=0) {
            int rem = n%10;
            ans = (ans*10) + rem;
            n=n/10;
            
        }
        return ans;
    }
    public static void isPalindrome(int a){
        if (reverse(a)==a) {
            System.out.println("the given num is palindrome");
        } else {
            System.out.println("the given num is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        isPalindrome(num);
        // System.out.println();
    }
}
