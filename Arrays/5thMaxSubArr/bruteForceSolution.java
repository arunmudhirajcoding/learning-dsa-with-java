 import java.util.Scanner;

//brute force solution to find the sum of maxmimum and minimum sum of subarrays (tc = O(n^3) ) 

public class bruteForceSolution {
    public static void subArray(int arr[],int n){
        System.out.println("Sub Arrays are:");
        // int time=0;
        int maxsum1 = Integer.MIN_VALUE;
        int minsum1 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // int maxsum = Integer.MIN_VALUE;
            // int minsum = Integer.MAX_VALUE;
            int start = i;
// System.out.println();
            for (int j = i; j < n; j++) {
                int end = j;

                int sum=0; 
                for (int k = start; k <=end; k++) {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println("\nthe sum of this subArray = "+sum);
                // if (minsum>sum) {
                //     minsum=sum;
                // } else if(maxsum<sum){
                //     maxsum=sum;
                // }

                // minsum=Math.min(minsum, sum);
                // maxsum=Math.max(maxsum, sum);
                maxsum1=Math.max(maxsum1, sum);
                minsum1=Math.min(minsum1, sum);

                // time++; 
            }
            // System.out.println("min of all sum:"+minsum);
            // System.out.println("max of all sum:"+maxsum);
            // System.out.println();
        }
        // System.out.println("the number of subarrays are  "+time);
        System.out.println("the max of all subarrays sum is "+maxsum1);
        System.out.println("the min of all subarrays sum is "+minsum1);
    }

    public static void readArray(int arr[],int n){
        System.out.println("Enter "+n+" elements: ");
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i]=Sc.nextInt();
        }
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
        subArray(arr, n);
    }
}

