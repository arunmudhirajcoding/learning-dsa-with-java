public class QuickSort {

    static void quick(int[] arr, int si, int ei){
        if (si>=ei) {
            return;
        }
        int pidx = partition(arr,si,ei);// paritioning the arr
        quick(arr, si, pidx-1);
        quick(arr, pidx+1, ei);

    }
    static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];// our pivot element is last element 
        //method -2
        int l = si,r =ei;
        while (l<r) {
            if (arr[l]> pivot) {
                int temp = arr[l];
                arr[l]=pivot;
                arr[r]=temp;
                r--;
            } else if (arr[r]<pivot) {
                int temp = arr[r];
                arr[r]=pivot;
                arr[l]=temp;
                l++;
            }else{
                if (arr[l]<pivot) {
                    l++;
                } else {
                    r--;
                }
            }    
        }
        
        // Method-1 (efficient way do to less conditions)
        // int i = si-1; // let the i index at outof the array
        // for (int j = si; j < ei; j++) { //looping over the array
        //     if (arr[j] <= pivot) {
        //         i++; 
        //         int temp = arr[j]; //swapping 2 adjucent elements
        //         arr[j] = arr[i];
        //         arr[i] = temp;
        //     }
        // }
        // i++;
        // int temp = pivot;
        //     arr[ei] = arr[i];
        //     arr[i] = temp;

        return l;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quick(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
