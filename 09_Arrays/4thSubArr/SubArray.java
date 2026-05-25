import java.util.Scanner;
// Sub Arrays are:
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// 2
// 2 3
// 2 3 4
// 2 3 4 5

// 3
// 3 4
// 3 4 5

// 4
// 4 5

// 5

// logic function
public class SubArray {
    public static void subArray(int arr[],int n){
        System.out.println("Sub Arrays are:");
        int NoOfSubArray=0;

        //we need subarrays upto last index
        for (int i = 0; i < n; i++) {
            
            // every subArray startes with i
            int start = i;
            
            // every line starts with i and ends upto n
            for (int j = i; j < n; j++) {
                
                // every subArray startes with j
                int end = j;

                // subarray logic
                for (int j2 = start; j2 <=end; j2++) {
                    System.out.print(arr[j2]+" ");
                    
                }
                NoOfSubArray++;
                System.out.println(); 
            }

            System.out.println();
        }
        System.out.println("the number of subarrays are + "+NoOfSubArray);
        
    }

    //reading array
    public static void readArray(int arr[],int n){
        System.out.println("Enter "+n+" elements: ");
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i]=Sc.nextInt();
        }
    }
    
    //printing original array
    public static void printArray(int arr[],int n){
        System.out.println("the elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(i+" -> "+arr[i]);
        }
        // System.out.println();
    }

    // main function
    public static void main(String[] args) {
        int arr[] = new int[20];
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = Sc.nextInt();

        readArray(arr,n);
        printArray(arr,n);

        subArray(arr, n);
    }
}
