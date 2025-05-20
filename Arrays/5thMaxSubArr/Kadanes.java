import java.util.*;

public class Kadanes {
    //logic: sum of element is negative them replace it with 0 
    //tc: O(n) bcoz one loop

    public static void kadanes(int arr[], int n) {
        int sum = arr[0], count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                count++;
            }

        }
        if (count < n) {
            int maxsum = Integer.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                sum += arr[i];
                sum = (sum < 0) ? 0 : sum;// negative sum replaced with 0 
                maxsum = Math.max(maxsum, sum); // max sum of sub arr
            }
            System.out.println(maxsum);
        } else {
            System.out.println("all are negative");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -1, -2,4, -3 };
        kadanes(arr, arr.length);
    }
}
