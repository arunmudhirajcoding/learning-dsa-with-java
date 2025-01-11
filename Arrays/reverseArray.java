import java.util.Scanner;

//space complexity is O(1) we don't made a array
//but ifa we make another array store origial array the space complexity is O(n)

//time complexity is O(n)



public class reverseArray {
    public static void revArray(int arr[],int n){
        int temp,i=0,j=n-1;
        System.out.println("elements after reversing:");
        while (i!=j) {
            temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
            i++;
            // System.out.println();
        }
        for (int j2 = 0; j2 < n; j2++) {
            System.out.println(arr[j2]+" at index-> "+j2);
        }
    }

    public static void readArray(int arr[],int n){
        System.out.println("Enter "+n+" elements: ");
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i]=Sc.nextInt();
        }
    }
    
    public static void printArray(int arr[],int n){
        System.out.println("the elements of original array are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" at index -> "+i);
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
       revArray(arr, n);
    }    
}
