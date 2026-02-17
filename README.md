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

