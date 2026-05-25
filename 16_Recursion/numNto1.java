public class numNto1 {
    public static void Nto1(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Nto1(n-1);

    }
    public static void OnetoN(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        OnetoN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        // Nto1(n);
        OnetoN(n);
        // for (int i = n; i >=1; i--) {
        //     System.out.println(i);
        // }
    }
}
