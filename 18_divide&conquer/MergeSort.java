public class MergeSort {

        // logic: divde from middle and solve for left and right for the same,
        // compare elements and insert it again in arr 
        //use : space doesn't matter
        //tc = O(nlogn)
        //sc = O(n) for temp_arr

    static void Ms(int[] arr,int si, int ei){
        if (si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2; // avoid datatype overflow 
        Ms(arr, si, mid); // left part
        Ms(arr, mid+1, ei); //right part
        Merge(arr,si,mid,ei); // merging part
    }
    static void Merge(int[] arr,int si, int mid, int ei){
        int i = si;
        int j = mid+1;
        int[] temp = new int[ei-si+1];//size = 5-0=5 but array size is 6 so +1
        int k = 0;// for temp
        while (i<=mid && j<=ei) { // we connt keep || bcoz after this codition we need to compare again both which indexOutOfBound Error on either i or j;
            
            if (arr[i]<arr[j]) {
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }

        }

        //remaining elements in left part
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        //remaining elements in right part
        while (j<=ei){
            temp[k++] = arr[j++];
        }

        //copying temp to arr
        for (k = 0,i=si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 5, 8, 2};
        Ms(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
