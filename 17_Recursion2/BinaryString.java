public class BinaryString {

    // 000
    // 001
    // 010
    // 100
    // 101

    // no consecutive 1 in binary string 
    static void binaryString(int lastPlace , int n , String str){
        // base case
        if (n== 0 ) {
            System.out.println(str);
            return;
        }

        if (lastPlace == 0) {
            binaryString(0, n-1, str+"0");
            binaryString(1, n-1, str+"1");
        } else {
            binaryString(0, n-1, str+"0");
        }
    }
    public static void main(String[] args) {
        binaryString(0,3,"");
    }
}
