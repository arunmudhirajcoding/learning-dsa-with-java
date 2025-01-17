public class Compression {
    // HW: write below code using string builder
    public static String compress(String str){
        StringBuilder newStr = new StringBuilder("");
        // String newStr = "";
        // //tc = O(n)
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<=str.length()-2 &&str.charAt(i) == str.charAt(i+1)   ) {
                count++;
                i++;
            }
            // newStr+=str.charAt(i);
            newStr.append(str.charAt(i));
            if (count>1) {
                newStr.append(count.toString());
                // newStr+= count.toString();
            }
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "aaaaaAbbbccdd";
        String CS = compress(str);
        System.out.println(CS);
    }
}
