
public class arrayTest {
    public static void main(String[] args) {
        int nums[] = new int[7];
        String str[] = new String[10];
        double doub[] = new double[10];
        boolean bool[] = new boolean[10];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(str[i]+" ");// null in all storage
            System.out.println(doub[i]+" ");//0.0
            System.out.println(bool[i]+" ");//false
            System.out.print(nums[i]+" ");// without initiaizes array for int type storees zero's
        }
    }
}
