
import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = Sc.nextInt();

        // aam sindhagi // it is more prefferend 

        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0){
        //             System.out.println("year is leap year");
        //         }
        //         else{
        //             System.out.println("not a leap year ");
        //         }
        //     }
        //     else{
        //     System.out.println("year is leap");
        //     }
        // }
        // else{
        //     System.out.println("not a leap year");
        // }

        // mentos zindagi
        // mentos zindagi

        boolean x = (year%4==0);
        boolean y = (year%100!=0);
        boolean z = ((year%100==0)&&(year%400==0));
        if(x&&(y||z)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap");
        }

    }
}
