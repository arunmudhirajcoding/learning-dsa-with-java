import java.util.*;

public class BinarySearch {
    // time complexity is O(logn)
    /*
        n-length of array
        convert into 2 halfs by mid
        n/2
        n/4
        n/8 ...
        :. n/2k=1
            n=2k
            logn=klog2=k
            k=logn
            tc=O(logn)


     */
    public static int Bsearch(int arr[],int key,int n){
        int start = 0,end =n-1;
        while (start<=end) {
            // System.out.println();
            int mid = (start+end)/2;
            if (arr[mid]==key) {
                System.out.println(key+" found at "+mid);
                return 0;
            } else if (arr[mid]<key) {
                start = mid+1;
                
            } else {
                
                end=mid-1;
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
        System.out.println("Enter a number to search in array: ");
        int num = Sc.nextInt();
        if(Bsearch(arr, num,n)==-1){
            System.out.println("element not found");
        }
    }
}
