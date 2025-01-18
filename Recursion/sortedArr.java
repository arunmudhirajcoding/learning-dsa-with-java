public class sortedArr {

    static Boolean isSorted(int arr[],int si){
        if (si==arr.length-1) {
            return true;
        }
        if (arr[si]>arr[si+1]) {
            return false;
        }
        return isSorted(arr, si+1);
    }
    public static void main(String[] args) {
        int[] arr = { 4, 5};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);





        // for (int i = 0; i < arr.length; i++) {
        //     if ((i+1)<=arr.length-1&&arr[i]>arr[i+1]) { // base case
        //         System.out.println("not sorted");
        //         return;
        //     }
        // }
        // System.out.println("sorted");
    }
}
