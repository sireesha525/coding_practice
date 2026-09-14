# AUCTION - Rating 328

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T23:04:04.462Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    if(x<3){
		        System.out.println("LIGHT");
		    }
		    else if(x>=3 && x<7){
		        System.out.println("MODERATE");
		    }
		    else{
		        System.out.println("HEAVY");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/AUCTION)