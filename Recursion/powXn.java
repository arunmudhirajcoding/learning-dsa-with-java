public class powXn {
    // logic is that 2^4 = 2x2x2x2 and also 2^4 = 2x2^3 that means x^n=x*x^(n-1)
    static int pow(int x, int n){
        if (n==0) {
            return 1;
        }
        return x*pow(x,n-1);
    }
    static int op_pow(int x, int n){
        if (n==0) {
            return 1;
        }
        int ans = op_pow(x, n/2)*op_pow(x, n/2);
        if (n%2!=0) {
            return x*ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 2,n=5;
        int ans =pow(x,n);
        int ans2 =op_pow(x,n);
        System.out.println(ans);
        System.out.println(ans2);
    }
}