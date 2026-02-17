public class productNotSelf {
    public static void main(String[] args) {
        int nums[] = { 10, 20, 30, 40, 50, 60 };
        int n = nums.length;
        long pre[] = new long[nums.length];
        long suf[] = new long[nums.length];
        long res[] = new long[nums.length];
        suf[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * nums[i];
        }
        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i];
        }

        // method-2
        for (int i = 0; i < res.length; i++) {
            if (i == 0) {
                res[i] = suf[1];
            } else if (i == n - 1) {
                res[i] = pre[n - 2];
            } else {
                res[i] = (pre[i - 1] * suf[i + 1]);
            }
        }

        // method-1
        // for (int i = 0; i < res.length; i++) {
        // res[i] = ((long)suf[i]*(long)pre[i])/((long)nums[i]*(long)nums[i]);// error
        // if element is 0
        // }

        //method -3 : direct multply from right and then left but initally put it multple with 1 (for excluding that ele)
        // int[] output = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     output[i] = 1;
        // }

        // int left = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     output[i] *= left;//excluding by multipling with 1
        //     left *= nums[i];
        // }

        // int right = 1;
        // for (int i = nums.length - 1; i >= 0; i--) {
        //     output[i] *= right;//excluding by multipling with 1
        //     right *= nums[i];
        // }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(res[i] + " ");
        }
    }
}
