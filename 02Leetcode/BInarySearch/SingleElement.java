public class SingleElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3 };
        int ans = 0;
        ans = result(ans, arr, 0, arr.length);
        System.out.println(ans);
    }

    public static int result(int ans, int[] arr, int si, int ed) {
        if (arr.length == 0) {
            return arr[0];
        }
        int mid = si + (ed - si) / 2;
        int a1 = result(ans, arr, 0, mid);
        int a2 = result(ans, arr, mid + 1, arr.length);
        return a1 ^ a2;
    }
}
