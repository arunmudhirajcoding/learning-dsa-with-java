package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHset {
    // order maintained
    // performance Lhm < Hm, lhs < hs (ordering less performanc)

    public static void main(String[] args) {
        
        // unOrdered
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Beng");
        cities.add("Hyd");

        System.out.println(cities);

        // Ordered
        LinkedHashSet<String> citieslhs = new LinkedHashSet<>();
        citieslhs.add("Hyd");
        citieslhs.add("Delhi");
        citieslhs.add("Beng");
        
        System.out.println(citieslhs);
        
        // treeSet -> treeMap -> redBlack 
        TreeSet<String> citiSet = new TreeSet<>();
        // sorted in ascending Order
        citiSet.add("Hyd");
        citiSet.add("Delhi");
        citiSet.add("Beng");

        System.out.println(citiSet);

    }

}
