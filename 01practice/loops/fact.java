package loops;
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = Sc.nextInt();
        int fact=1;
        if (num==0) {
            fact = 1;
        }
        else if(num==1){
            fact =1;
        }
        else{

            for(int i = 1;i<=num;i++){
                fact*=i;
            }
        }
        // System.out.println();
        System.out.println("the factorial of number is "+fact);
    }
}
