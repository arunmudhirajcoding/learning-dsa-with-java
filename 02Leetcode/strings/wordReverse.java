import java.util.ArrayList;
import java.util.Arrays;

public class wordReverse {
    public static void main(String[] args) {
        String str = "  Hello   World  ";
        str = str.replaceAll("\\s+", " ").trim();
        ArrayList<String> words = new ArrayList<>(Arrays.asList(str.trim().split(" ")));
        ArrayList<String> reversedlist = new ArrayList<>();
        for (int i = words.size() - 1; i >= 0; i--) {
            reversedlist.add(words.get(i));
        }
        str = reversedlist.toString().join(" ", reversedlist);
        System.out.println(words);
        System.out.println(str);

    }
}
