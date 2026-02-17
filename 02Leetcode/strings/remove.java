
import java.util.*;

public class remove {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("ccctltctlltlb");// dknfdsnd
        String part = "ctl";
        System.out.println(str.length());
        // s.toString().equals(part);
        System.out.println(str);
        int i = 0;
        while (i < str.length() && ((i + part.length()) <= str.length())) {
            System.out.println(str);
            String s = str.substring(i, i + part.length());
            System.out.println(str.length());
            System.out.println(i + " " + (i + part.length()));
            System.out.println("s is" + s);
            try {
                if (s.equals(part)) {
                    str.delete(i, i + part.length());
                    System.out.println("str is " + str);
                    i = 0;
                    System.out.println(i);
                } else {
                    i++;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("somthing is fish" + e.getMessage());
            }

        }
        System.out.println(str);

    }
}
