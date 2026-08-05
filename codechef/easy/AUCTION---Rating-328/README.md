# AUCTION - Rating 328

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-05T14:30:34.625Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0; i<t;i++){
		    int x=sc.nextInt();
		if(x<3){
		    System.out.println("LIGHT");
		}
		else if(x<7){
		    System.out.println("MODERATE");
		}
		else{
		    System.out.println("HEAVY");
		}                                                         
	}  
	sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/AUCTION)