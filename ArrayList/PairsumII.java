import java.util.ArrayList;

public class PairsumII {
    // Q:rotated&sorted list [11,15,6,8,9,10]
    // logic: 1.find pivot ele here 15 bcoz change will be after 15
    // 2.we know rp is larget and lp is smallest. here rp=pivot,lp=pivot+1;
    // 3. whenever rotated logic we use modulo arthematic bcoz we need sol within
    // the list 0 to n-1
    // 4. lp=(lp+1)%n , rp=(n+rp-1)%n from point 3
    //tc = O(n)
    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int pivot = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int n = list.size() - 1;
        int lp = pivot + 1, rp = pivot;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        if (pairsum(list, 3)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
