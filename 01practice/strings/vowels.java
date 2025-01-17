public class vowels {
    public static void main(String[] args) {
        String str = "ShradhaDidi";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char v = str.charAt(i);
            if (v == 'a' || v == 'e'|| v ==  'i' || v == 'o' || v == 'u' ) {
                count++;
            }
        }
        System.out.println(count);

    }
}
