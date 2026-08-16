# Print With Separator

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You'll be given two strings  **a**  and  **b,**  a separator symbol, and you need to print  **a**  and  **b**  such that a and b are separated by the separator symbol followed by a new line.

 **Example :** 

```
Input: a = "Hello", b = "World", separator = "@"
Output: Hello@World
Explanation: a and b are printed with the separator symbol in between.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T06:24:39.827Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String separator = sc.nextLine();

        // code here
        System.out.println(a+separator+b+"");
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-with-separator/1)