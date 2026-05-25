import java.util.ArrayList;

public class PairSum {

    // thought by list is sorted
    // two pointer tc=O(n)
    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size() - 1;
        while (lp <rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    // Brute force tc = O(n^2)
    // public static boolean pairsum(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size() - 1; i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        if (pairsum(list, 50)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
