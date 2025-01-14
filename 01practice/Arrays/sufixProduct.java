public class sufixProduct {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60};
        int n = nums.length;
        int res[] = new int[nums.length];
        res[n-1] = nums[n-1];
        for (int i = n-2; i >=0; i--) {
            res[i]=res[i+1]*nums[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]+" ");
        }
    }
}
