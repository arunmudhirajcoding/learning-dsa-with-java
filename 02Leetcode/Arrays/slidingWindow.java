import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class slidingWindow {
    public static int[] slide(int nums[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        // int[] arr = new int[ans.size()];
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 1 };
        int k = 1;
        ArrayList<Integer> arr = new ArrayList<>(k);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            arr.add(nums[i]);
        }
        System.out.println(arr);
        int right = k;
        ans.add(Collections.max(arr));
        while (right<nums.length) {     
            arr.removeFirst();
            arr.addLast(nums[right]);
            System.out.println(arr);
            ans.add(Collections.max(arr));
            System.out.println(ans);
            right++;
        }
        int[] res = new int[ans.size()];
        
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println(ans);

    }
}
