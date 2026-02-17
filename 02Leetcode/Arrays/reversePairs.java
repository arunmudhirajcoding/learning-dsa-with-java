import java.util.Arrays;

public class reversePairs {
    public static int pairs(int nums[]){
        int ans= 0;
        int left = 0, right = nums.length-1;
        while (left<right) {
            if (nums[left]>2*nums[right]) {
                ans++;
            }else if(nums[left]<=nums[right]){
                
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
    }
}
