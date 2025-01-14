public class prefixProduct {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60};
        int res[] = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < res.length; i++) {
            res[i]=res[i-1]*nums[i];
        }
        

        // for (int i = 0; i < nums.length; i++) {
        //     int prefix = 1;
        //     for (int j = 0; j <=i; j++) {
        //         prefix=prefix*nums[j];
        //     }
        //     res[i] = prefix;
        // }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
