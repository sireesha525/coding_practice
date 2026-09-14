# ONEMORE - Rating 319

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T00:19:30.653Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		if(x<3){
		    System.out.println("GOLD");
		}
		else if(x<6){
		    System.out.println("SILVER");
		}
		else{
		    System.out.println("BRONZE");
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ONEMORE)