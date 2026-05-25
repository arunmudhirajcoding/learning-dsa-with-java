    // idea: pick an eleement (from unsorted part) & place in the right pos in sorted part
    // tc = O(n^2)
public class insertionSort {
    public static void main(String[] args) {
     int nums[] = {5, 4, 1, 6, 2};
        int n =nums.length;
        //looping from 1st index to last
        for (int i = 1; i < n; i++) {
            //storing element
            int curr = nums[i];
            int prev = i-1;
            //comparing previous elements with stored element
            while(prev >= 0&& nums[prev] > curr){
                
                //pushing previous element to front
                nums[prev+1] = nums[prev];

                // going to previous index 
                prev --;
            }
            // fill the space with stored element
            nums[prev+1] = curr;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }    
    }
    
}
