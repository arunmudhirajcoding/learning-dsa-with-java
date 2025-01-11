import java.util.*;
public class FindEven{
    public static boolean isEven(int a){
        if (a%2==0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        boolean ans =isEven(num);
        System.out.println(ans);
        // System.out.println();
    }
}