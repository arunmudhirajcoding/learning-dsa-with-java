import java.util.*;
public class pairsInArray {
    public static void paris(int arr[],int n){
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
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
        readArray(arr,n);
        printArray(arr,n);
        paris(arr, n);
        
    }
}
