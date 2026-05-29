package hash;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHmap {
    public static void main(String[] args) {
        // order is maintained in lhm coz it uses double LinkedList
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("china", 133);
        lhm.put("US", 103);
        
        System.out.println(lhm);
        
        // keys are sorted order - Tc = O(logn) - implemented by RedBlack tree
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India", 100);
        thm.put("China", 133);
        thm.put("US", 103);
        
        System.out.println(thm);
        
        
        
    }
}
