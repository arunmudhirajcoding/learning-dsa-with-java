
import java.util.Arrays;
import java.util.Collections;

// tc  = O(n logn)
public class inbuiltSort {
    public static void main(String[] args) {
        Integer nums[] = {5, 4, 1, 6, 2};
        int n =nums.length;
        for (int i = 0; i < nums.length; i++) {
            // Arrays.sort(nums);
            // Arrays.sort(nums,0,3);
            Arrays.sort(nums,0, 3, Collections.reverseOrder());// this won't work for premitive dt so convert into objective type 
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }    
    }
}
