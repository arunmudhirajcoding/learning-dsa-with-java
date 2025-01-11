public class duplicates {

    // tc = O(n^2)
    public static boolean dup(int nums[]){
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    // return value true if any duplicate elements are present in nums
                    return true;
                }
                // System.out.println("hiii");
            }
        }
        return false;
    }

    //tc = O(n) using hashsets
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean ans = dup(nums);
        System.out.println(ans);
    }
}
