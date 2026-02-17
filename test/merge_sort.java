public class merge_sort {
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int s1 = si, e1 = mid, s2 = mid + 1, e2 = ei, k = 0;
        int temp[] = new int[ei - si + 1];
        while (s1 <= e1 && s2 <= e2) {
            if (arr[s1] < arr[s2]) {
                temp[k++] = arr[s1];
                s1++;

            } else {
                temp[k++] = arr[s2];
                s2++;
            }
        }
        while (s1 <= e1) {
            temp[k++] = arr[s1];
            s1++;
        }
        while (s2 <= e2) {
            temp[k++] = arr[s2];
            s2++;
        }

        for (k = 0, s1 = si; k < temp.length; k++, s1++) {
            arr[s1] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 6, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        mergeSort(arr, 0, arr.length-1);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
