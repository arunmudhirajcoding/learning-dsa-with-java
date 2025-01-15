import java.util.*;
public class BasicStrings {

    public static void main(String[] args) {
        char arun[] = {'A', 'r', 'u', 'n'};
        String s1 = "Hello World!"; // String Literal
        String s2 = new String("Hello World!"); // String object

        //Strings are immutable
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);// only prints Arun not Arun kumar bcoz space or next line characters wont read 
        String name2 = sc.nextLine();
        System.out.println(name2);// prints entire word or sentence 

        // string length
        System.out.println(name2.length());//it is a built in function in java

        // imp: length of string is not the same as length of char array, it is the number of characters in the string + 1 which is the null character

        // string concatenation
        String s3 = "Hello World!";
        System.out.println(s3 + " " + name2);// Hello World! Arun
        sc.close();

        //charAt()
        System.out.println(name2.charAt(4)); // prints A if name2 is Arun
        //printing null character of string
        System.out.println(name2.charAt(name2.length()-1)); // prints null character if name2 is Arun
    }
}