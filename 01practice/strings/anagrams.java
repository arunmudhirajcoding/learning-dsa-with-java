import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "Arun";
        String str2 = "raku";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // if (str1.length() == str2.length()) {

        // //convert string into character array
        // char[] str1Arry = str1.toCharArray();
        // char[] str2Arry = str2.toCharArray();

        // // sort all both arrays
        // Arrays.sort(str1Arry);
        // Arrays.sort(str2Arry);
        // // System.out.println(str1Arry);
        // // System.out.println(str2Arry);

        // //comparing this both arrays
        // boolean result = Arrays.equals(str1Arry, str2Arry);

        // if (result) {
        // System.out.println("they are anagrams");
        // } else {
        // System.out.println("they are not anagrams");

        // }

        // } else {
        // System.out.println("not a anagrams");
        // }
        // System.out.println(str1);
        if (str1.length() != str2.length()) {
            System.out.println("not anagrams");
        }

        // Step 2 : since letter are lower from a to z
        int[] count = new int[26];

        // Step 3 : Count each letter from s
        for (char c : str1.toCharArray()) {
            count[c - 'a']++;
            System.out.println(count[c - 'a']);
            
        }

        // Step 4 : decrease count by using t
        for (char c : str2.toCharArray()) {
            count[c - 'a']--;
            System.out.println(count[c - 'a']);
            // Check if any digit is negative while decresing
            if (count[c - 'a'] < 0) {
                System.out.println("not anagrams");
            }
        }
        System.out.println("they are anagrams");

    }
}
