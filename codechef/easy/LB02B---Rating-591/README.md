# LB02B - Rating 591

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem(Farm animals) - Generate examples

Now that we have understood the problem statement, let us write down a few more sample cases or examples.
Review the sample input / output given in the table below.

### Sample 1:
Input
Output

```
8 sample inputs 
2 3 4
2 3 5
2 3 6
2 3 7
2 3 8
2 3 9
2 3 10
2 3 11
```

```
8 sample inputs 
CHICKEN
NONE
ANY
NONE
CHICKEN
DUCK
CHICKEN
NONE
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-30T16:25:09.150Z  

```cpp
// Step 1: Read and understand the problem statement and sample test cases

// Click on 'Next' once you are ready to proceed
import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            boolean canHaveChicken=(x%2==0);
            boolean canHaveDuck=(y%2==0);
            if(canHaveChicken && canHaveDuck){
                System.out.println("ANY");
            }
            else if(canHaveChicken)
            
            
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LB02B)