import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int prime = Sc.nextInt();

        int count = 0;
        // System.out.println();
        // aam zindagi
        // for(int i=2;i<prime;i++){
        // if(prime%i==0){
        // count++;
        // }
        // }
        // if(count==0){
        // System.out.println("prime");

        // }
        // else{
        // System.out.println("not a prime");
        // }

        // mentos zindagi
        int ite = 0;
        for(int i =2 ; i<=(Math.sqrt(prime));i++){
            ite ++;
        if(prime%i== 0){
        count++;
        }
        }

        // for(int i =2 ;Math.pow(i, 2)<prime;i++){
        // ite++;
        // if(prime%i== 0){
        // count++;
        // }
        // }
        System.out.println(ite);
        if (count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}
