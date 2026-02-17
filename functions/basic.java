public class basic {

    // simple void function: computes a + b and prints the result
    public static void addAndPrint(int a, int b) { // void: no return value and parameters
        System.out.println("Sum: " + (a + b));
    }

    // demo main
    public static void main(String[] args) { 
        addAndPrint(3, 5); // arguments: 3 and 5
        // prints: Sum: 8 
    }
}