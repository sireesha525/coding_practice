# Calculator

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two numbers  **a**  and  **b** ; you need to perform basic mathematical operation on them. You will be provided an integer named as **operator. 
 **If operator equals to** 1  **add**  a  **and**  b**, then print the result as a string.
If operator equals to  **2** subtract **b** from  **a,** then print the result as a string.
If operator equals to  **3** multiply **a** and **b,** then print the result as a string.
If operator equals to any another number **,**  print "Invalid Input"(without quotes).
 **Note:**  Do not add a new line at the end

 **Examples:** 

```
Input: a = 1, b = 2, opr = 3
Output: 2
Explanation: 1 * 2 = 2
```

```
Input: a = 2, b = 2, opr = 2
Output: 0
Explanation: 2 - 2 = 0
```

 **Constraints:** 
-100 ≤ a,b ≤ 100

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-17T06:21:14.888Z  

```py
class Solution:
    def utility(self, a, b, opr):
        # code here
        if(opr==1):
            result=a+b
        elif(opr==2):
            result=a-b
        elif(opr==3):
            result=a*b
        else:
            result="Invalid Input"
        print(str(result))
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/calculator/1)