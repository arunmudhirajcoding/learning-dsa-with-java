import java.util.*;

public class ncr {
        public static int fact(int n){
            int f = 1;
            for (int i = 1; i <=n; i++) {
                f=f*i;
            }
            return f;
        }
        public static int binoCoef(int n, int r){
            if (n==1 && r == 0) {
                return 1;
            } else if (n==0 && r == 1) {
                return 0;
                // System.out.println();
            }else {
                
                int n_fact =fact(n);
                int r_fact = fact(r);
                int rmn_fact = fact(n-r);
                return (n_fact/(r_fact*rmn_fact));
            }
        }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n and r values: ");
        int n = Sc.nextInt();
        int r = Sc.nextInt();
        System.out.println("the factorial of "+n+" , "+r+" is "+ binoCoef(n, r));

    }
}
