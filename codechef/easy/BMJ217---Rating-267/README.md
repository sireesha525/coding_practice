# BMJ217 - Rating 267

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-28T05:08:37.761Z  

```java
// The code below is incorrect. Debug the code to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		int n = read.nextInt();
    		
    	    int points_per_testcase = x /10;
    		int score = points_per_testcase * n;
    		
    		System.out.println(score);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ217)