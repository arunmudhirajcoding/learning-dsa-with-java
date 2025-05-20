public class opBubbleSort {
    public static void modifiedBubbteSort( int arr[]) {
        int swapped = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped ++;
                }
            }
            if (swapped==0) {// used flag bcoz in any turn the array is sorted before the loop. then it exit
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(swapped);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5};
        modifiedBubbteSort(arr);
    }
}
