
public class Palindrome {
        public static void main(String[] args) {
            String s = "noon";
            int length = s.length();
            for (int i = 0; i < length/2; i++) {
                if (s.charAt(i)!=s.charAt(length-1-i)) {
                    System.out.println("not a palindrome");
                    return;
                }

            }
            System.out.println("it is a palindrome");
        }
}
