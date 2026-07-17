# Multiplication Table

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, print the multiplication table from 1 to 10 for n in a single line, separated by spaces.

 **Examples:** 

```
Input: n = 9
Output: 9 18 27 36 45 54 63 72 81 90
```

```
Input: n = 2
Output: 2 4 6 8 10 12 14 16 18 20

```

 **Constraints:** 
1 ≤ n ≤ 106

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-17T06:12:25.256Z  

```py
n = int(input())

# code here
for i in range(1,11):
    print(i*n,end=" ")
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/multiplication-table/1)