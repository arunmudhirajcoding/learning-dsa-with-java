public class fact {
    public static int facto(int n){
        if (n==0 || n == 1) {
            return 1;
        }
        return n*facto(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(facto(n));

        // int fact =1 ;
        // for (int i = 1; i <=n; i++) {
        //     fact*=i;
        // }
        // System.out.println(fact);
    }
}
