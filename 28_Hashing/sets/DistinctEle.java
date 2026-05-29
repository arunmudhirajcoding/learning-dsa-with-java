package sets;

import java.util.HashSet;

public class DistinctEle {
    public static void main(String[] args) {
        int[] num = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        // Brute force tc=O(n^2)

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }

        System.out.println("distinct ele are "+ set.size());
    }
}
