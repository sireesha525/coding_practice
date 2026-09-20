# DOREWARD - Rating 395

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T16:46:29.388Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // Check if the distance to home is less than or equal to the maximum travel distance
            if (y <= 5 * x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DOREWARD)