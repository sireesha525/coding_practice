# REACH_HOME - Rating 390

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T16:45:44.432Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Check if Om's money + Gymkhana funds can cover the laptop's price
        if (n <= x + m) 
            System.out.println("YES");
        else 
            System.out.println("NO");
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/REACH_HOME)