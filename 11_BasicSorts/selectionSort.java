
public class selectionSort {

    // smallest goes left
    // comapring all elements and swap at last
    //tc = O(n^2)
    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 6, 2};
        int n =nums.length;
        int min = 0;
        // elements from 0th index to n-2th element
        for (int i = 0; i < n; i++) {
            //loop to find min element
            for (int j =i; j < n; j++) {
                
                if (nums[min]<nums[j]) {
                    min=j;
                }
            }
            // swaping element
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp; 
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        } 
    }    
}
