public class add1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(-(~n));

        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);
        
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x);
        
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }
}

