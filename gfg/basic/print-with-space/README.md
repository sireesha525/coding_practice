# Print With Space

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two inputs that are store in variables  **a**  and **b**, you need to print a and b in a single line with a space separating them.
Add new line after printing with space.

 **Example :** 

```
Input: a = "Hello", b = "World"
Output: Hello World
Explanation: a and b are printed in a single line and a space separates them.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T06:32:33.587Z  

```java
public class Solution {
    public void utility(Scanner scn) {
        // code here
        String a=scn.nextLine();
        String b=scn.nextLine();
        System.out.println(a+" "+b);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-with-space/1)