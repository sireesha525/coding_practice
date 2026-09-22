# HOTCOLD - Rating 410

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T16:31:15.547Z  

```java

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        double Y = scanner.nextDouble();

        // Check if the withdrawal amount is a multiple of 5 
        // and if there is enough balance for the amount plus the 0.50 charge.
        if (X % 5 == 0 && X + 0.50 <= Y) {
            Y -= (X + 0.50);
        }

        // Print the final balance with exactly two decimal places.
        System.out.printf("%.2f\n", Y);
	}
}

	

```

---

[View on CodeChef](https://www.codechef.com/problems/HOTCOLD)