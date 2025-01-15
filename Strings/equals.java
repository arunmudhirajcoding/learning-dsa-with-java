
public class equals {
    public static void main(String[] args) {
        String s1 = new String("arun");
        String s2 = "arun";
        String s3 = "arun";
        if (s1 == s2) { //  equal content but comparing one is object one is literal
            System.out.println("Strings are equal ");
        } else {
            System.out.println("strings are not equal");
        }

        if (s2 == s3) { // both are literals
            System.out.println("Strings are equal ");
        } else {
            System.out.println("strings are not equal");
        }

        if (s1.equals(s3)) { // compares only content eventhough one is literal and one object
            System.out.println("Strings are equal ");
        } else {
            System.out.println("strings are not equal");
        }
        

    }
}
