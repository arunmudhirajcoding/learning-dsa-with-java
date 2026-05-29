package hash;
import java.util.HashMap;
import java.util.Set;

public class Basic {
    public static void main(String[] args) {
        // creation
        HashMap<String, Integer> hm = new HashMap<>();

        // insertion - tc= O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        // UnOrdered Sequence
        System.out.println(hm);

        // get the value, tc=O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("bhutan")); // null value for key doesnt exist

        // ContainsKey - tc= O(1) -boolean
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("bhutan"));

        // Remove - tc-O(1)
        // returns value if exist , null is doesnt exist
        System.out.println(hm.remove("India"));

        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // is empty
        System.out.println(hm.isEmpty());

        // clear . remove everything
        // hm.clear();
        // System.out.println(hm); // empty map



        // Sets
        Set<String> keys = hm.keySet();
        System.out.println(keys);


        for (String k : keys) {
            System.out.println("key= "+k+",value= "+hm.get(k));
        }

    }
}
