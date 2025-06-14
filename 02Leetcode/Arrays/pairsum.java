public class pairsum {

    //optimal solution
    // public int[] twoSum(int[] nums, int target) {
    //     for (int i = 1; i < nums.length; i++) {
    //         for (int j = i; j < nums.length; j++) {
    //             if (nums[j] + nums[j - i] == target) {
    //                 return new int[] { j - i, j };
    //             }
    //         }
    //     }
    //     return new int[] {};
    // }

    //my solution
    public int[] twoSum(int[] nums, int target) {
        int sum[] = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for (int j = i+1; j < nums.length; j++) {
                
                if(nums[i]+nums[j]==target){
                    sum[0]=i;
                    sum[1]=j;
                    System.out.println("in if "+i+" "+(j));
                    return sum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        int res[] = new int[2];
        pairsum ps = new pairsum();
        res = ps.twoSum(arr, 6);

        for (int i = 0; i < res.length; i++) {

            System.out.println(res[i]);
        }
    }
}
