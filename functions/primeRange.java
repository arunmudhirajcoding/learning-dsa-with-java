import java.util.*;
public class primeRange {

    public static Boolean isPrime(int i){
        if( i==2){
            return true;
        }
        else{
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i%j==0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void primeInRange(int n){
        for(int i = 2; i<=n ; i++){
            if(isPrime(i)){
                // System.out.println();
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        primeInRange(a);
    }
}
