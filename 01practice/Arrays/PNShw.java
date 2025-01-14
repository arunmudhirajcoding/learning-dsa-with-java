public class PNShw {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60};
        int n = nums.length;
        int product = 1;
        int res[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            product*=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = product/nums[i]; // error if the element is 0
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(res[i]+" ");
        }
    }
}
