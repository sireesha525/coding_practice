# String Functions I - Python

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Python has a lot of string methods that can be used to manipulate the strings like converting to lowercase, capitalizing, trimming the spaces and so on.

In this question, we'll take a look at inbuilt string methods like **title(), swapcase(), find(), strip().** 
You'll be given a string  **str**  and  **x,**  you'll perform various operations on them.

 **Example:** 

```
Input:
str = hello 
x = llo
Output:
hello 
2 
Hello 
HELLO
```

 **Your Task:** 
This is a function problem. Do not take any input. just Complete the functions  **trim(), exists(), titleIt(), casesSwap().**

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-19T05:07:12.198Z  

```py
def trim(str):
    return str.strip()


def exists(str, x):
    return str.find(x)


def titleIt(str):
    return str.title()


def casesSwap(str):
    return str.swapcase()
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-functions-i/1)