public class HeapSort {
    // Heapsort tc = O(nlogn) just like the merge sort and quick sort but heapsort is less efficient


    //  MaxHeap provide Decreasing order and MinHeap provide Ascending order. it is the order when peek() but in sorting we need inplace sorting . 
    // so MinHeap sort is Decreasing and MaxHeap sort is Ascending.

    // to convert minHeap to MaxHeap . call Heapify for Non-leaf nodes
    // EG: 1,2,4,5,3 -> Non-leaf are 1,212
    // 

    public static void heapify(int i,int size, int[] arr){
        int left = 2*i +1;
        int right = 2*i +2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            
            heapify(maxIdx, size, arr);
        }
    }

    public static void heapSort(int arr[]){
        // step-1 Build maxHeap
        int n = arr.length;
        for (int i = n/2; i >= 0; i--) {
            heapify(i,n,arr);
        }

        // step-2 push largest at end . same as selection sort
        for (int i = n-1; i > 0; i--) {
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0,i,arr);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
