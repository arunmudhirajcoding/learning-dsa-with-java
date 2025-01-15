import java.util.Scanner;

public class KadanesSolution_02 {
    // kadanes method for negative array
    
    public static void Kadane(int arr[])
    {
        int maxsum = Integer.MIN_VALUE;
        int currSum=0;
        int count=0;
                // checks wheather the all elements are negative
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i]<0) {
                        count++;
                    }
                }
                //if all elements are negative provides max in element
                if (count==arr.length) {
                    for (int i = 0; i < arr.length; i++){
                        maxsum=Math.max(maxsum, arr[i]);
                    }
                }
                //if all not negative then use kadanes algo
        else{
            for (int i = 0; i < arr.length; i++) 
        {
            
            currSum+=arr[i];
            if (currSum<0) {
                currSum=0;
            }
            if (maxsum<currSum) {
                maxsum=currSum;
            }
            
        } 
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

