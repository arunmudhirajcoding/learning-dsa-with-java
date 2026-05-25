# Topics Covered
## 1. FlowCharts & Pseudocodes
- what are flowcharts and pseudocodes?
- Flowchart components
- some examples of flowcharts and pseudocodes

## 2. Variables, Data Types
- creating java file
- boilerplate code
- output in java (System.out.println)
- variables and data types in java
- comments in java
- input in java (Scanner class)
- some basic problems on variables, data types and input/output
- type conversion
- type casting
- type promotion in expression
- how does java code run 

## 3. Operators
- operators and operands
- arithmetic operators- +, -, *, /, %
- unary operators- ++, --
- relational operators- ==, !=, >, <, >=, <=
- logical operators- &&, ||, !
- bitwise operators- &, |, ^, ~, <<, >>, >>>
- assignment operators- =, +=, -=, *=, /=, %=
- precedence and associativity of operators

## 4. Conditional Statements
- if statement
- if-else statement
- if-else-if ladder
- ternary operator(? :)
- switch statement
- some basic problems on conditional statements

## 5. Loops (flow control statements)
- for loop
- while loop
- do-while loop
- break and continue statements
- some basic problems on loops

## 6. patterns(part - 1 basic patterns)
- intro to nested loops
- star pattern
- inverted star pattern
- half pyramid pattern
- character pattern

## 7. functions and methods
- intro to functions
- syntax of functions in java
- parameters and arguments 
- call stack
- call by value
- inbuilt vs user defined functions
- function overloading(using parameters and data types)
- binary to decimal conversion using functions
- method scope and block scope

## 8. patterns(part - 2 advanced patterns)
- hollow rectangle pattern
- inverted and rotated half pyramid pattern
- floyd's triangle pattern
- o-1 triangle pattern
- diamond pattern
- butterfly pattern
- solid rhombus pattern
- hollow rhombus pattern
- palindromic pattern
---
# Data Structures
---

## 9. Arrays (part - 1 basic array problems)
- intro to arrays
- creation , input, output and update
- Array as function argument
- linear and binary search
- largest in array
- reverse an array
- pairs in array
- subarrays
- values apprearing 2 times in an array ( brute force)
- 3sum problem

## 10. Arrays (part - 2 advanced array problems)
- max Subarray sum - prefix array, kadane's algo (for negative no.'s)
- trapping rainwater - axuillary array (left and right heights)
- best time to buy and sell stock 
- find the target in rotated sorted array (Binary search)

## 11. Basic Sorting Algorithms
- bubble sort
- selection sort
- insertion sort
- inbuilt sorting algorithms (Arrays.sort() and Collections.sort())
- counting sort

## 12. 2D Arrays
- intro to 2D arrays
- representation of 2D arrays in memory
creation, input, output and update of 2D arrays
- Spiral order traversal of 2D array
- Diagonal sum of 2D array
- search in 2D array (staircase search)
- transpose of a matrix (nxn and mxn)

## 13. Strings
- intro to strings
- input and output of strings
- string length and concatenation
- string charAt method
- string functions (substring, indexOf, lastIndexOf, equals, compareTo, toLowerCase, toUpperCase, trim)
- palindrome problem
- anagram problem
- shortest path problem
- largest string
- lexicographical order problem(largest string)
- why string are immutable in java?
- string builder and string buffer
- string pool and string constant pool and string interning
- string compression

## 14. Bit Manipulation
- intro to bit manipulation
- binary to decimal conversion
- decimal to binary conversion
- bitwise operators
- Binary 1's complement
- get ith bit, set ith bit, clear ith bit, toggle ith bit
- clear last i bits
- clear range of bits
- power of 2 or not
- count set bits
- fast exponentiation
- swapping
- add 1 to an integer
- uppercase to lowercase

## 15. OOPs
- classes and objects
   - one public class per file
- Access modifiers
- getters and setters
   - this keyword
- Encapsulation
- constructors
   - types of constructors
   - rules
   - constructor overloading
- copy Constructor
- shallow and deep copy
- inheritance
   - single , mutilevel, hierarchical, hydbrid
- interfaces (multiple inheritance)
- polymorphism
   - method overriding(run time)
   - method overloading(compile)
- packages
- method hiding
   - abstraction (may have non abstract methods)
   - interface (pure abstraction)
      - rules for methods and variables
- static keyword
- super keyword
- final keyword
- expection handling

## 16. Recursion
- intro to recursion
   - recursion 3 steps
- stack overflow 
- is array sorted
- first occurence
- last occurence
- x to pow n

## 17. Recursion (part 2 advanced recursion problems)
- Tiling problem
- remove duplicates from string
- friends pairing problem
- binary strings 
- stack analysis - binary strings 
-










# classic problems
1. max pair sum - prefix array, kadane's algo (for negative no.'s)
2. trapping rainwater - axuillary array (left and right heights)


| Code                               | Type           | Where Stored? | Reused? |
| ---------------------------------- | -------------- | ------------- | ------- |
| `String s1 = "hello";`             | String Literal | String Pool   | Yes     |
| `String s2 = new String("hello");` | String Object  | Heap          | No      |


String Pool:            
   "java"
     ↑   ↑
    s1  s2


Heap:
   new "java"   new "java"
      ↑             ↑
     s3             s4


# Analyzing Problem Constraints

## 1. `n == nums.length`

This means:

| Variable | Description |
| --- | --- |
| `n` | The number of elements in the array `nums` |

## 2. `1 <= n <= 5 * 10^4`

This means:

The array has between 1 and 50,000 elements.

## Why it’s important:

It directly affects which algorithmic approach is efficient enough.

| Approach | Time Complexity | Feasibility for n = 5×10⁴ |
| --- | --- | --- |
| O(n) | Linear | Perfect — runs fast |
| O(n log n) | Slightly slower | Acceptable |
| O(n²) | Quadratic | Too slow — 2.5 billion ops! |
| O(2ⁿ) | Exponential | Impossible |

- 👉 So if you see n <= 5×10⁴, you immediately know:
You must aim for O(n) or O(n log n) solutions.

## 3. `-10⁹ <= nums[i] <= 10⁹`

This means:

Each element in the array can be very large or very small, but still fits in a 32-bit integer.

## Why it’s important:

It tells you what data type to use (e.g., int vs long in Java / C++).
It helps prevent integer overflow when doing operations like sum or multiplication.

For example:
```js
let sum = nums.reduce((a, b) => a + b); // might overflow if sum > 2^31
```
In this case, if the problem involves adding or multiplying numbers, you might need to use a 64-bit integer (long / BigInt) to stay safe.


## 4. There are multiple classes in the same file
| Situation                             | Allowed? |
| ------------------------------------- | -------- |
| 1 public class per file               | ✅        |
| 2 public classes in same file         | ❌        |
| Multiple default classes in same file | ✅        |
| Public class + default classes        | ✅        |
| File name different from public class | ❌        |

