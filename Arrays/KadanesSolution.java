import java.util.Scanner;

public class KadanesSolution {
    // logic is to assign zero to the result sum if the result sum = negative
    //and continue adding next element to resultant sum(0)
    // tc = O(n)
    
    public static void Kadane(int arr[])
    {
        int maxsum = Integer.MIN_VALUE;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) 
        {
            currSum+=arr[i];
            if (currSum<0) {
                currSum=0;
            }
            if (maxsum<currSum) {
                maxsum=currSum;
            }
            // System.out.println();
        }
        System.out.println("the maxsum of subArray is : "+maxsum);
    }

    public static void readArray(int arr[])
    {
        System.out.println("Enter "+arr.length+" elements: ");
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=Sc.nextInt();
        }
    }
    
    public static void printArray(int arr[])
    {
        System.out.println("the elements are: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        readArray(arr);
        printArray(arr);
        Kadane(arr);
        
    }
}
