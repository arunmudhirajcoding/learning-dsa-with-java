import java.util.*;

public class avgMethod {
    public static void avg(int a, int b, int c){
        int sum = a+b+c;
        double avg = sum/3.0;
        System.out.println("avg of given three numbers is : "+avg);
    }    

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt(),b = Sc.nextInt(),c =Sc.nextInt();
        avg(a, b, c);
        // System.out.println();
    }
}
