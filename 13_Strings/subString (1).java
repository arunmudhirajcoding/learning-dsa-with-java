
public class subString {

    public static String getSubString(String str,int si, int ei){
        String substr = "";
        //tc = O(n)
        for (int i = si; i < ei; i++) {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        String subStr = getSubString(str, 2, 7);
        System.out.println(str.substring(2,7)); // inbuilt
        System.out.println(subStr);
    }
}
