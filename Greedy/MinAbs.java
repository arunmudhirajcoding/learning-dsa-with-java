import java.util.Arrays;

public class MinAbs {
    public static void main(String[] args) {//tc=O(nlogn)

        //find the sum of absulote diffrence a and b pairs is min 
        //less difference between those pair will be perfect pair ( eg: 4 and 3 = 4-3 = 1,  is better than 4 and 6 = 4-6 = 2 )
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };
        // int A[] = { 1, 2, 3 };
        // int B[] = { 2, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("min absolute diff of pairs = "+ minDiff);

    }
}
