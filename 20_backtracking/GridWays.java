public class GridWays {

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // using recurrsion tc = 2^(n+m)
    // public static int gridWays(int i,int j,int n,int m){
    // if (i==n-1&&j==m-1) {
    // return 1;
    // } else if (i==n||j==m) {
    // return 0;
    // }
    // int r = gridWays(i, j+1, n, m);
    // int d = gridWays(i+1, j, n, m);
    // return r+d;
    // }

    public static void main(String[] args) {
        int n = 3, m = 3;
        // System.out.println("number of ways are "+gridWays(0,0,n,m));
        System.out.println("number of ways are " + (fact(n-1+m-1))/(fact(n-1)*fact(m-1)));
    }
}
