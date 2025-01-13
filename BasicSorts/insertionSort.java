    // idea: pick an eleement (from unsorted part) & place in the right pos in sorted part
    // tc = O(n^2)
public class insertionSort {
    public static void main(String[] args) {
     int nums[] = {5, 4, 1, 6, 2};
        int n =nums.length;
        // elements from 0th index to n-2th element
        for (int i = 1; i < n; i++) {
            //loop to find min element
            int curr = nums[i];
            int prev = i-1;
            while(prev >= 0&& nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev --;
            }
            nums[prev+1] = curr;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }    
    }
    
}
