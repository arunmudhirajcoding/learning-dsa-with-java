public class Triplets {
    public static void triplets(int nums[]){
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int j2 = j+1; j2 < nums.length; j2++) {
                    if ((nums[i]+nums[j]+nums[j2])==0) {
                        System.out.println(nums[i]+", "+ nums[j]+", "+ nums[j2]);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        triplets(nums);
        // System.out.println();
    }
}