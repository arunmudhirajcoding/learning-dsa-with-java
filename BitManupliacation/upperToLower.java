public class upperToLower {
    public static void main(String[] args) {
        // The ASCII value of ' ' (space) is 32.
        // Using bitwise OR operator (|) with ' ' (space) adds 32 to the ASCII value of the character
        // which effectively converts the uppercase character to lowercase

        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz

        // ASCII value of 'A' is 65
        // ASCII value of 'a' is 97
        //difference is 32
    }
}
}


