public class opBubbleSort {
    public static void modifiedBubbteSort( int arr[]) {
        boolean swapped = false;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    swapped=true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (swapped==false) {// used flag bcoz in any turn the array is sorted before the loop. then it exit
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(swapped);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        modifiedBubbteSort(arr);
    }
}
