# INSURANCE - Rating 470

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T16:34:51.224Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of friends
            int m = scanner.nextInt(); // Maximum capacity of the course
            int k = scanner.nextInt(); // Students already registered
            
            // Check if the remaining capacity (m - k) is greater than or equal to n
            if (n <= m - k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/INSURANCE)