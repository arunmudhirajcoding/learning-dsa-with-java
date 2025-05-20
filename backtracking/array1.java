
public class array1 {

    public static void bckarr(int[] arr,int si , int ei){
        if (si==ei) {
            printArray(arr);
            return;    
        }
        arr[si]=si;
        bckarr(arr, si+1, ei);
        arr[si]=arr[si]-1;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= new int[5];
        bckarr(arr, 0, arr.length);
        printArray(arr);
    }
}
