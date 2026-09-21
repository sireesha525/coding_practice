# DISCNT - Rating 399

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T00:11:42.784Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x<y){
		        System.out.println("FIRST");
		    }
		    else if(x>y){
		        System.out.println("SECOND");
		    }
		    else{
		        System.out.println("ANY");
		    }
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DISCNT)