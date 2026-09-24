# SPECIALITY - Rating 432

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T13:53:23.227Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt(); // Cost of disposable mask
            int y = sc.nextInt(); // Cost of cloth mask
            
            int disposableCost = x * 100;
            int clothCost = y * 10;
            
            // If disposable is strictly cheaper, choose disposable
            // Otherwise, choose cloth (handles both cheaper cloth and ties)
            if (disposableCost < clothCost) {
                System.out.println("Disposable");
            } else {
                System.out.println("Cloth");
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SPECIALITY)