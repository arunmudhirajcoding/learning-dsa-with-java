import java.util.Scanner;

/*

*   
* * 
* * *  
* * * * 
* * * * * 

 */

public class lefttri {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        // System.out.println();
        for (int line = 1; line <=num; line++) {
            for(int star =1 ; star<=line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}