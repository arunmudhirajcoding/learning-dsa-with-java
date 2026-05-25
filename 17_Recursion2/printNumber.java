public class printNumber {
    static String[] nums = { " Zero ", " one", " two", "three", " four", " five", " six", " seven", " eight", " nine" };

    static void wordNumber(int num) {
        if (num == 0) {
            return;
        }
        int digit = num % 10;
        num /= 10;

        wordNumber(num);
        System.out.print(nums[digit] + " ");
    }

    public static void main(String[] args) {
        wordNumber(2019);
        // String str = "ar";
        // int i = 0;
        // while (str.charAt(i+1)!='\0') {
        // // count++;

        // }
        // System.out.println(i);
    }
}
