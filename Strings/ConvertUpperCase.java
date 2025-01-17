public class ConvertUpperCase {
    public static void main(String[] args) {
        // Question 4
        // For a given String convert each the first letter of each word to uppercase.

        //Eg: hi, i am Arun -> Hi, I Am Arun

        //logic after space every word starts

        String str = "hi, i am Arun and vijay ";
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        //tc = O(n)
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==' ' && i<str.length()-1) {//&& for should less than end char of string
                sb.append(str.charAt(i));
                i++;
                ch = str.charAt(i);
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
