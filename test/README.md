# Java Numeric Literals, Suffixes, and Number Representations

This document explains Java literal suffixes (like `f`, `d`, `L`), number literal formats (binary, octal, hex, underscores), and internal number representations (IEEE-754, two's complement, overflow/underflow).

---

## Float suffix: `f` / `F`

A decimal literal like `3.14` is treated as a `double` by default. To assign to a `float`, append `f` or `F`, or cast.

Examples:

```java
float x = 3.14;      // ❌ compile error: possible lossy conversion from double to float
float y = 3.14f;     // ✔ OK
float z = (float)3.14; // ✔ OK (explicit cast)
```

---

## Other suffixes in Java

| Suffix  | Meaning                                     | Example      |
| ------- | ------------------------------------------- | ------------ |
| `f`/`F` | float literal                               | `3.14f`      |
| `d`/`D` | double literal (optional)                   | `3.14d`      |
| `l`/`L` | long integer literal                        | `100L`       |
| none    | int (for integers) or double (for decimals) | `42`, `3.14` |

> Best practice: use uppercase `L` for long literals because lowercase `l` can look like `1`.

---

## Integer literal suffix (long)

If an integer literal is too large for `int`, append `L` / `l`:

```java
long x = 12345678901;    // ❌ compile error (too large for int)
long y = 12345678901L;   // ✔ OK
```

---

## Double literal suffix (`d`)

Decimal literals default to `double`, so `d` is optional:

```java
double a = 3.14;   // ✔ default double
double b = 3.14d;  // ✔ same result
```

---

## Number literal formats

### 1. Decimal (base 10)

Default format:

```java
int x = 123;
double y = 3.14;
```

### 2. Binary (base 2) — Java 7+

Prefix: `0b` or `0B`

```java
int bin = 0b1010; // 10 decimal
```

### 3. Octal (base 8)

Prefix: leading `0` (legacy)

```java
int oct = 012; // 10 decimal (1*8 + 2)
```

> ⚠️ Note: `012` is octal, not decimal 12.

### 4. Hexadecimal (base 16)

Prefix: `0x` or `0X`

```java
int hex = 0xFF; // 255 decimal
```

### 5. Floating-point literals

Default: `double`. `float` requires `f` suffix.
Scientific notation:

```java
double e1 = 1.5e3;  // 1500.0
double e2 = 2.0E-2; // 0.02
float  f  = 3.14f;
```

### 6. Long literals

Suffix: `L` or `l`

```java
long big = 12345678901L;
```

### 7. Underscores in numeric literals (Java 7+)

Use `_` for readability:

```java
int million = 1_000_000;
double pi    = 3.14_159_265;
long card    = 1234_5678_9012_3456L;
```

Illegal placements: leading/trailing `_`, adjacent to decimal point, or next to suffix.

Bad examples:

```java
int x = _100;      // ❌
int y = 100_;      // ❌
double z = 3._14;  // ❌
double w = 3_.14;  // ❌
```

### 8. Hexadecimal floating-point literals (rare)

Syntax: hex significand + `p` exponent (power of 2):

```java
double val = 0x1.0p3; // equals 8.0 (1.0 * 2^3)
```

---

## How Java stores floating-point numbers (IEEE-754)

Java follows IEEE-754:

-   float: 32 bits total
    -   1 bit sign
    -   8 bits exponent
    -   23 bits fraction (mantissa)
-   double: 64 bits total
    -   1 bit sign
    -   11 bits exponent
    -   52 bits fraction

Not all decimals can be represented exactly in binary. Example:

```java
System.out.println(0.1 + 0.2); // prints 0.30000000000000004
```

This small rounding error is normal for IEEE-754.

---

## float vs double

-   float: 32-bit, ~7 decimal digits precision, suffix `f`
-   double: 64-bit, ~15 decimal digits precision, default for decimals

When to use:

-   float: large arrays, graphics, memory-sensitive use-cases
-   double: general-purpose scientific calculations
-   For money, use BigDecimal (avoid float/double)

---

## Integer overflow & underflow

Java integer types (byte, short, int, long) use fixed-size storage and two's complement. They wrap on overflow — no exception.

Example (int range: –2,147,483,648 to 2,147,483,647):

```java
int x = Integer.MAX_VALUE;
System.out.println(x);      // 2147483647
System.out.println(x + 1);  // -2147483648  (overflow)
```

Underflow example:

```java
int y = Integer.MIN_VALUE;
System.out.println(y - 1);  // 2147483647 (underflow)
```

---

## Two's complement representation (integers)

Java uses two's complement for signed integers.

To get `-x` in two's complement:

1. Write binary of `x`
2. Invert bits (0 → 1, 1 → 0)
3. Add 1

Example: represent `-5` in 8 bits

```
5      -> 0000 0101
invert -> 1111 1010
+1     -> 1111 1011
=> -5 = 11111011 (two's complement)
```

Advantages:

-   Single zero representation
-   Addition/subtraction works uniformly
-   Efficient hardware implementation

---

## Summary table (quick reference)

|            Topic |                                       Key points |
| ---------------: | -----------------------------------------------: |
|         Suffixes | `f/F` float, `d/D` double (optional), `l/L` long |
|         Defaults |            integers → `int`, decimals → `double` |
|      Underscores |   Allowed for readability (with placement rules) |
| Floating storage |        IEEE-754: float (32-bit), double (64-bit) |
|        Precision |               float ~7 digits, double ~15 digits |
| Integer overflow |              Wraps around using two's complement |
|    Use for money |              Prefer BigDecimal, not float/double |

---

If you want, I can:

-   add runnable Java examples,
-   include BigInteger/BigDecimal usage samples,
-   or convert this into a shorter cheat-sheet.



| Language        | Why portable                                                            |
| --------------- | ----------------------------------------------------------------------- |
| **Python**      | Interpreters available for all OS                                       |
| **JavaScript**  | Runs anywhere a browser or Node.js exists                               |
| **C**           | Portable if written with standards (ANSI C) and avoids OS-specific code |
| **C++**         | Same as C; portable if libraries are portable                           |
| **Go (Golang)** | Cross-compilation built into the compiler                               |
| **Rust**        | Cross-platform toolchain, compile to many targets                       |
| **Ruby**        | Interpreter available on many systems                                   |
| **PHP**         | Runs wherever a PHP engine exists                                       |


 ## "Best Examples of “Write Once, Run Anywhere”

### These languages provide the strongest portability guarantees:

1. Java
2. Python
3. JavaScript
4. WebAssembly (WASM)
5. .NET C# using .NET Core (cross-platform)

| Feature            | C     | Java  |
| ------------------ | ----- | ----- |
| Memory addresses   | ✔ Yes | ❌ No  |
| Pointers           | ✔ Yes | ❌ No  |
| Manual memory mgmt | ✔ Yes | ❌ No  |
| Garbage collection | ❌ No  | ✔ Yes |
| Portability        | Low   | High  |



### function syntax in java :
```java
<modifiers> <type parameters> <return type> <method name>(<parameter list>)
        <throws clause> {
    <method body>
}
```
