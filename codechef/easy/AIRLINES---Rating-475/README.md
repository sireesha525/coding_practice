# AIRLINES - Rating 475

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T16:36:19.076Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // The rebated amount is the minimum of the repair cost (y) and the limit (x)
            System.out.println(Math.min(x, y));
        }
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/AIRLINES)