import java.util.Scanner;

//space complexity is O(1) we don't made a array
//but if we make an another array brr to store origial array in reverse  the space complexity is O(n)

//time complexity is actually O(n/2) but due to constant -> O(n) //for loop of swaping



public class reverseArray {
    public static void revArray(int arr[],int n){
        int temp,start=0,end=n-1;
        System.out.println("elements after reversing:");
        while (start!=end) {

            //swaping start and end elements
            temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            //pointers
            start++;//start pointer
            end--;//end pointer
        }
        for (int j2 = 0; j2 < n; j2++) { // reversed array
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

        readArray(arr,n);//input array
        printArray(arr,n);//print array

        revArray(arr, n);//print reverse array
    }    
}
