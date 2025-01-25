public class QuickSort {

    static void quick(int[] arr, int si, int ei){
        if (si>=ei) {
            return;
        }
        int pidx = partition(arr,si,ei);
        quick(arr, si, pidx-1);
        quick(arr, pidx+1, ei);

    }
    static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
            arr[ei] = arr[i];
            arr[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,10,4,8,9};
        quick(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
