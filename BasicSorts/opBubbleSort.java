public class opBubbleSort {
    public static void modifiedBubbteSort( int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) {
                break;
            }
        }
    }
}
