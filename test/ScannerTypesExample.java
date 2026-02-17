
// Example: read many Java data types with Scanner
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class ScannerTypesExample {

    public static void operatorPrecedenceExamples() {
        System.out.println("Operator Precedence & Associativity examples (Java)\n");

        // 1) Multiplicative (*) before Additive (+)
        int r1 = 1 + 2 * 3; // 1 + (2*3) = 7
        int r1p = (1 + 2) * 3; // (1+2)*3 = 9
        System.out.println("1 + 2 * 3 = " + r1 + "    (multiplicative before additive)");
        System.out.println("(1 + 2) * 3 = " + r1p + "    (parentheses override)\n");

        // 2) Unary prefix vs postfix and evaluation order
        int x1 = 2;
        int u1 = ++x1 * 3; // (++x1 = 3) * 3 = 9
        int x2 = 2;
        int u2 = x2++ * 3; // (x2++ yields 2) * 3 = 6, x2 becomes 3 after
        System.out.println("++x * 3  where x=2 -> " + u1 + "  (prefix increments before use)");
        System.out.println("x++ * 3  where x=2 -> " + u2 + "  (postfix uses old value)\n");

        // 3) Additive before Shift (<<)
        int s1 = 1 + 2 << 2; // (1+2) << 2 = 3 << 2 = 12
        System.out.println("1 + 2 << 2 = " + s1 + "    (additive has higher precedence than shift)\n");

        // 4) Shift associativity: left-to-right
        int sh = 64 >> 2 >> 1; // (64 >> 2) >> 1 -> 16 >> 1 = 8
        System.out.println("64 >> 2 >> 1 = " + sh + "    (shift is left-to-right associative)\n");

        // 5) Relational (<) vs additive: + evaluated before <
        boolean bool = 5 < 3 + 4; // 5 < (3+4) -> true
        System.out.println("5 < 3 + 4 -> " + bool + "    (+ before <)\n");

        // 6) Equality (==) has higher precedence than bitwise &:
        // Example showing grouping: (a == b) | c -- but to keep types consistent use
        // booleans
        boolean eq = (1 == 1) & (2 > 3); // (true) & (false) -> false
        System.out
                .println("(1 == 1) & (2 > 3) -> " + eq + "    (equality and relational evaluated before bitwise &)\n");

        // 7) Bitwise AND (&), XOR (^), OR (|) precedence: & > ^ > |
        int bw = 1 | 2 ^ 3 & 7; // grouping: 1 | (2 ^ (3 & 7))
        System.out.println("1 | 2 ^ 3 & 7 = " + bw + "    ( & > ^ > | )\n");

        // 8) Logical && and || (short-circuit) lower than bitwise ops
        boolean L = true || false && false; // && evaluated before ||
        // => true || (false && false) => true
        System.out.println("true || false && false -> " + L + "    (&& before ||)\n");

        // 9) Ternary (?:) is right-to-left associative
        int tern = false ? 1 : false ? 2 : 3; // false ? 1 : (false ? 2 : 3) => 3
        System.out.println("false ? 1 : false ? 2 : 3 -> " + tern + "    (ternary is right-to-left associative)\n");

        // 10) Assignment is right-to-left associative
        int a = 1, b = 2, c = 3;
        a = b = c + 1; // b = (c + 1) -> 4 ; a = b -> 4
        System.out.println("a = b = c + 1 -> a=" + a + ", b=" + b + "    (assignment is right-to-left)\n");

        // 11) Compound assignment does implicit cast (works even if plain op would need
        // cast)
        byte bb = 10;
        // bb = bb + 1; // compile error: int result -> needs cast
        bb += 1; // compiles: implicit cast back to byte
        System.out
                .println("byte bb = 10; bb += 1 -> bb = " + bb + "    (compound assignment includes implicit cast)\n");

        // 12) Bitwise vs logical with booleans: & evaluates both sides, &&
        // short-circuits
        boolean sideA = false;
        boolean sideB = (1 / 0) == 0; // would throw if evaluated
        // Demonstrate short-circuit: false && (1/0 == 0) -> RHS not evaluated
        boolean safe = false && (1 / 0 == 0);
        // Demonstrate non-short-circuit: false & (1/0 == 0) -> RHS evaluated =>
        // ArithmeticException if used
        System.out.println("false && (1/0 == 0) -> " + safe + "    (&& short-circuits)\n");

        // 13) instanceof precedence: evaluated after shift/arithmetics etc.
        String s = "hi";
        boolean inst = s instanceof String;
        System.out.println("\"hi\" instanceof String -> " + inst + "\n");

        // 14) Unary + and - have very high precedence (after postfix)
        int up = - -+ +5; // parsed as - ( - ( + ( +5 ) ) ) => -(-(+(+5))) = 5
        System.out.println("- - + +5 = " + up + "    (multiple unary operators evaluate right-to-left)\n");

        // 15) Demonstrate right-to-left associativity for assignment with side-effects
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        i1 = (i2 += (i3 *= 2)); // i3 = i3*2 -> 6; i2 = i2+6 -> 8; i1 = 8
        System.out.println("i3*=2; i2+=i3; i1=i2 -> i1=" + i1 + ", i2=" + i2 + ", i3=" + i3);

        System.out.println("\nTip: when in doubt, add parentheses to make grouping explicit and readable.");
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("byte: ");
        // byte b = sc.nextByte();

        // System.out.print("short: ");
        // short s = sc.nextShort();

        // System.out.print("int: ");
        // int i = sc.nextInt();

        // System.out.print("long: ");
        // long l = sc.nextLong();

        // System.out.print("float: ");
        // float f = sc.nextFloat();

        // System.out.print("double: ");
        // double d = sc.nextDouble();

        // System.out.print("boolean: ");
        // boolean bool = sc.nextBoolean();

        // // consume end-of-line before using nextLine()
        // sc.nextLine();

        // System.out.print("char: ");
        // char c = sc.next().charAt(0);
        // sc.nextLine(); // consume rest of line

        // System.out.print("String (token): ");
        // String token = sc.next();

        // sc.nextLine(); // move to next line if needed
        // System.out.print("String (line): ");
        // String line = sc.nextLine();

        // // read an int array: first n then n ints
        // System.out.print("array length: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("enter " + n + " ints:");
        // for (int idx = 0; idx < n; idx++) arr[idx] = sc.nextInt();

        // // BigInteger / BigDecimal from token
        // System.out.print("BigInteger: ");
        // BigInteger bi = new BigInteger(sc.next());

        // System.out.print("BigDecimal: ");
        // BigDecimal bd = new BigDecimal(sc.next());

        // // print collected values (short form)
        // System.out.println("Read values: " + b + " " + s + " " + i + " " + l + " " +
        // f + " " + d + " " + bool
        // + " " + c + " " + token + " | line: " + line + " | arr len: " + arr.length +
        // " | bi: " + bi + " | bd: " + bd);

        // sc.close();

        // System.out.println("aryn");
        // int a = 10;
        // int b = ++a + ++a + a++;
        int a = 10;
        int b = 10;
        // b = +a; act as unary plus
        // b= %a; // invalid bcoz % is not unary operator
        // b |= a;
        System.out.println(b);

        System.out.println((1.2 / 2));

        // max_val = a*(a>=b and a>=c) + b*(b>=a and b>=c) + c*(c>=a and c>=b)

        // System.out.println(new String[]{"true","false"}[5%2==0?0:1]);
        System.out.println(11 | 0);
        String s1 = """
This is a text block example.
arajrjoe
                """;
        System.out.println(s1);

       
    }
}