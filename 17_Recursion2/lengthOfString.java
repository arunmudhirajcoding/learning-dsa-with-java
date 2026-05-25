public class lengthOfString {
    static int lOString(String str){
        if (str.length()==0) {
            return 0;
        }

        return lOString(str.substring(1))+1;
    }
    public static void main(String[] args) {
        System.out.println(lOString("arun"));
    }
}
