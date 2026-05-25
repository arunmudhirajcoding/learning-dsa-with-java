import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class equals {

    public static void main(String[] args) {
        String s1 = new String("arunkiiunn");
        String s4 = new String("arun");
        String s2 = "arun";
        String s3 = "arun";
        if (s1 == s2) { // equal content but comparing one is object and one is literal (is called
                        // **interning** )
            System.out.println("Strings are equal ");
        } else {
            System.out.println("strings are not equal");
        }

        if (s2 == s3) { // both are literals and Both s3 and s2 point to the same memory location —
                        // because literals are reused.
            System.out.println("Strings are equal ");
        } else {
            System.out.println("strings are not equal");
        }
        if (s1 == s4) { // both are literals and Both s3 and s2 point to the different memory location —
                        // because objects creates new objects.
            System.out.println("Strings are equal ");
        } else {
            System.out.println("strings are not equal");
        }

        if (s1.equals(s3)) { // compares only content eventhough one is literal and one object
            System.out.println("Strings are equal ");
        } else {
            System.out.println("strings are not equal");
        }

        String mk = s1.substring(1, 4);
        System.out.println(mk.equals("run"));
        // s1.copyValueOf(null, 0, 0);
        List<String> myList = new ArrayList<String>(Arrays.asList(s1.split("")));
        System.out.println(myList);
        List<String> toRemove = new ArrayList<>(Arrays.asList(s2.split("")));

        myList.removeFirst();
        s1 = String.join("", myList);
        System.out.println(myList);
        System.out.println(s1);
    }
}
