package sets;

import java.util.HashMap;

public class LargeSubarrZero {

    /*
    Largest subArray with 0 sum
    arr = {15, -2, 2, -8, 1, 7, 10}
    sum(i+1, j) = sum(0,j) - sum(0, i)
    0 = sum(j) - sum(i)
    sum(j) = sum(i)


    */
    
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();


        int sum = 0;
        int len = 0;

        for (int i = 0; i < arr.length; i++) { // tc = O(n)
            sum += arr[i];
            if (map.containsKey(sum)) {
                len = Math.max(len, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }

        System.out.println(len);
        
    }
}
