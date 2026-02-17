public class duplicat {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int k = 1,count=0;
        for (int i = 0; i < arr.length; i++) {
            if (k==arr[i] && count==2) {
                break;
            }
            if (k==arr[i]) {
                count++;
            }
        }
        
    }
}
