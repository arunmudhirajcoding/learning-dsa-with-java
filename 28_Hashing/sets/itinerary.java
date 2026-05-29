package sets;

import java.util.HashMap;

public class itinerary {

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revmap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revmap.put(tickets.get(key), key);//reversed
        }

        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets); //O(n)
        System.out.print(start);
        for (String key : tickets.keySet()) { //O(n)
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start); //from = to
        }

        System.out.println();

    }
}
