import java.util.Scanner;

/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */

public class i05_zerosones {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for (int i = 1; i <=num; i++) {
            // for (int j = i; j>=1; j--) {
            //     System.out.print((j%2)+" ");
            // }
// out 
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }

    }    
}
