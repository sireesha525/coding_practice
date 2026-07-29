# LBJ201 - Rating 577

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-29T16:11:14.685Z  

```java
// How to check if A and C are both odd or even?
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    int a = 15;
	    int c = 17;
	    if(a%2 == 0 && c%2 == 0){
	        System.out.println("Both A and C are even");
	    }
        else if(a%2!= 0 && c%2!= 0){
	        System.out.println("Both A and C are odd");
	    }
	    else{
	        System.out.println("A is odd and C is even or vice versa");
	    }
	    
	    a = 15;
	    c = 18;
	    if(a%2== 0 && c%2== 0){
	        System.out.println("Both A and C are even");
	    }
        else if(a%2!= 0 && c%2!= 0){
	        System.out.println("Both A and C are odd");
	    }
	    else{
	        System.out.println("A is odd and C is even or vice versa");
	    }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LBJ201)