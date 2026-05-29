package hash;
import java.util.HashMap;
import java.util.Set;

public class MajorityEle {
    // tc = O(n) due to loop
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3, 1, 5, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i], 1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // if key found then give value and add+1, otherwise default value 0+1
        }

        // Set<Integer> keySet = map.keySet();
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
        
    }
}
