
public class BubbleSort {

    // logic: bubble which are big means having more air flys high 
    //large element goes right
    // eevery comparing we swap the element
    //tc = O(n^2)
    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 5, 0};
        int n =nums.length;
        // front element
        for (int i = 0; i < n-1; i++) {
            // next element
            for (int j =1; j < n-i; j++) {
                // if front element is greater than next element swap
                if (nums[j-1]>=nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
