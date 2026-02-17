import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        
        Arrays.sort(nums);
        for (int k = 0; k < nums.length-2; k++) {
            int i = k+1,j=nums.length-1;
            while (i<j) {
                System.out.println(nums[k]+nums[i]+nums[j]);
                if (nums[k]+nums[i]+nums[j]==0) {
                    set.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    i++;
                }else if (nums[k]+nums[i]+nums[j]<0) {
                    i++;
                }else{
                    j--;
                }
            }
        }
        lists.addAll(set);
        return lists;
        
    }
    
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};//-4,-1,-1,0,1,2
        //[1,0,-1,0,-2,2] -2,-1, 0,0,1,2
        List<List<Integer>> lists = new ArrayList<>();
        lists = threeSum(nums);
        System.out.println(lists);
    }
}
