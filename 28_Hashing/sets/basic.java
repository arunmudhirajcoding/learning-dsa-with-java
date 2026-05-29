package sets;

import java.util.HashSet;
import java.util.Iterator;

public class basic {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(); //unorderd
        hs.add(10);
        hs.add(12);
        hs.add(10);
        hs.add(13);

        System.out.println(hs);

        hs.add(null); // null allowd
        
        System.out.println(hs);
        System.out.println(hs.size());

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Beng");
        cities.add("Hyd");

        // iterating using Iterator class
        // Iterator<String> it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // enhance for loop
        for (String city : cities) {
            System.out.println(city);
        }

        
    }
}
