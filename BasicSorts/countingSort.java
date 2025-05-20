
public class countingSort {

    // use: if there no. of data is small means we know the range of data
    
    // create frequency array
    //EG: 1, 4, 1, 3, 2, 4, 3, 7
    // FArr = 0 2 1 2 2 0 0 1 // zeros means number not exist
    // index  0 1 2 3 4 5 6 7 
    //1. size of FArr if largest element in original array
    // create sorted array using Farr:
    // 1 1 2 3 3 4 4 7
    // 
    public static void main(String[] args) {
        int nums[] = {1, 4, 1, 3, 2, 4, 3, 7};
        int largest = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) { // finding largest element for the size of frezency array
            largest = Math.max(largest, nums[i]);
        }
        int FArr[] = new int[largest+1];//including 0 

        for (int i = 0; i < FArr.length; i++) {
            // increasing the count of the corresponding index in FArr wrt element
            // EG: nums[i] = 1, then FArr[1] = FArr[1] + 1; means one more 1 is present in original array
            FArr[nums[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < FArr.length; i++) {
            while (FArr[i] > 0) { // until the element gets 0
                //if element in farr is present means that index ele is present in original array 
                nums[j] = i;
                j++;
                // decrease the count or element
                FArr[i]--;
            }
        }

    }
}
