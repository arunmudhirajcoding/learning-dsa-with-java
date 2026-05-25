import java.util.ArrayList;

public class waterContainer {
    
    //tc=O(n)
    public static void MostWater(ArrayList<Integer> container) {
        // two pointer Approach
        int lp = 0, rp = container.size() - 1;
        int maxWater = Integer.MIN_VALUE;
        while (lp < rp) {
            int water = Math.min(container.get(lp), container.get(rp)) * (Math.abs(lp - rp));
            maxWater = Math.max(maxWater,water);
            if (container.get(lp)<=container.get(rp)) {
                lp++;
            }else{
                rp--;
            }

        }
        System.out.println(maxWater);
    }

    // brute force tc=O(n^2)
    // public static void MostWater(ArrayList<Integer> container){
    // int max = Integer.MIN_VALUE;
    // int water=0;
    // for (int i = 0; i < container.size(); i++) {
    // for (int j = i+1; j < container.size(); j++) {
    // water = Math.min(container.get(i), container.get(j))*(Math.abs(i-j));
    // max=Math.max(water, max);
    // }
    // }
    // System.out.println(max);
    // }
    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(1);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);
        MostWater(container);
        // System.out.println(Math.abs(-4));
    }
}
