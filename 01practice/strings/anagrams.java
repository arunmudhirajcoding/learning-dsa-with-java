import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "Arun";
        String str2 = "ranu";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            
            //convert string into character array
            char[] str1Arry = str1.toCharArray();
            char[] str2Arry = str2.toCharArray();

            // sort all both arrays
            Arrays.sort(str1Arry);
            Arrays.sort(str2Arry);
            // System.out.println(str1Arry);
            // System.out.println(str2Arry);
            
            //comparing this both arrays
            boolean result = Arrays.equals(str1Arry, str2Arry);

            if (result) {
                System.out.println("they are anagrams");
            } else {
                System.out.println("they are not anagrams");
                
            }
            
        } else {
            System.out.println("not a anagrams");
        }
        // System.out.println(str1);

    }
}
