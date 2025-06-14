
public class mergeSortStr {

    public static void mergeSort(String str[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(str, si, mid);
        mergeSort(str, mid + 1, ei);
        merge(str, si, mid, ei);
    }

    public static void merge(String str[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        String temp[] = new String[ei - si + 1];
        while (i <= mid && j <= ei) {
            if (((str[i].compareTo(str[j])) < 0)?true:false) {
                temp[k++] = str[i++];
            } else {
                temp[k++] = str[j++];

            }
        }
        while (j <= ei) {
            temp[k++] = str[j++];
        }
        while (i <= mid) {
            temp[k++] = str[i++];
        }
        for (int l = 0,m=si; l < temp.length; l++,m++) {
            str[m] = temp[l];
        }
    }

    public static void main(String[] args) {
        String[] str = { "sun", "earth", "mars", "mercury" };
        mergeSort(str, 0, str.length-1);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
