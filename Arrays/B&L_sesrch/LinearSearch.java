import java.util.*;
public class LinearSearch {
        // time complexity is O(n)
    public static int Lsearch(int arr[],int key,int n){//linear search code
        for (int i = 0; i < n; i++) {
            if (arr[i]== key) {
                System.out.println(key+" found at "+i);
                return i;
            }
        }
        return -1;
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

        readArray(arr,n);//scanning array
        printArray(arr,n);//reading array

        System.out.println("Enter a number to search in array: ");
        int num = Sc.nextInt();//key to search


        if (Lsearch(arr, num,n)==-1) {//func returns -1 if element not found
            System.out.println("element not found");
            
        }
    }    
}
