import java.util.*;

public class pairsInArray {

    //logic: 2 loops 1st ele with next all, 2nd ele with next all ....
    //tc: O(n^2) nested loop

    public static void paris(int arr[],int n){//paring ele code

        // print pairs (1,2) (1,3) (1,4) (1,5)
        //             (2,3) (2,4) (2,5) ...

        for (int ele = 0; ele < n ; ele++) {
            for (int next = ele+1; next < n; next++) {
                System.out.print("("+arr[ele]+","+arr[next]+")");
            }
            System.out.println();
        }
    }

    public static void readArray(int arr[],int n){
        System.out.println("Enter "+n+" elements: ");
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i]=Sc.nextInt();
        }
        // System.out.println();
    }
    
    public static void printArray(int arr[],int n){
        System.out.println("the elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(i+" -> "+arr[i]);
        }
        // System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[20];
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = Sc.nextInt();

        readArray(arr,n);//input arr
        printArray(arr,n);//print arr

        paris(arr, n);
        
    }
}
