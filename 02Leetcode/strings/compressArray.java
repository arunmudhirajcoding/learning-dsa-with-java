
public class compressArray {
    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        StringBuilder s = new StringBuilder("");
        System.out.println(chars);
        if (chars.length == 1) {
            s.append(chars[0]);
        }
        int i = 0, j = 0, count = 0;
        while (i < chars.length) {
            char ch = chars[i];
            s.append(ch);
            count = 0;
            while (i < chars.length && chars[i] == ch) {
                i++;
                count++;
                System.out.println("a");
            }
            if (count > 1) {
                s.append(count);
            }
        }
        // chars = s.toString().toCharArray();
        System.out.println(s.length());
        for(int k = 0 ; k< s.length() ; k++){
            chars[k] = s.charAt(k);
        }
        System.out.println(chars);
        chars.clone();
    }
}
