public class rotateSearch {

    public  static int search(int arr[],int si,int ei,int tar){
        int mid = si+(ei-si)/2;
        if (arr[mid]==tar) {
            return mid;
        } 
        if (arr[si]<=arr[mid]) {
            if (arr[si]<=tar&&tar<=arr[mid]) {
                return search(arr, si, mid-1, tar);
            } else {
                return search(arr, mid+1, ei, tar);
            }
        } else {
            if (tar>=arr[mid]&&tar<=arr[ei]) {
                return search(arr, mid+1, ei, tar);
            } else {
                return search(arr, si, mid-1, tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3};
        int ans = search(arr, 0, arr.length-1, 2);
        System.out.println(ans);
    }
}
