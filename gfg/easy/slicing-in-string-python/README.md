# Slicing in String - Python

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Here we'll talk about the novel and perhaps tantalizing concept of  **slicing**. Slicing is the process through which you can extract some continuous part of a string. For example: string is " **python** ", let's use slicing in this. Slicing can be done as:

 **a.**  string **[0:2]**  =  **py**  (Slicing till index 1)
 **b.**  string **[0:]**  =  **python**  (Slicing till last index)
 **c.**  string **[0:4]**  =  **pyth**  (Slicing till index 3)
 **d.**  string **[0:-2]**  =  **pyth**  (Slicing till index -3).
 **Note:**   **-1**  indexing starts from last of any string.

Now, lets look into this through a question. Given a string of braces named  **bound_by**, and a string named  **tag_name**. The task is to print a new string such that  **tag_name** is in the  **middle** of  **bound_by**.

 **Example 1:** 

```
Input: 
bound_by = [[]], tag_name = tag
Output:
[[tag]]

```

 **Example 2:** 

```
Input: 
bound_by = <>, tag_name = body
Output:
<body>
```

 **Your Task:** 
Your task is to complete the function  **join_middle()**  which should  **return** the modified string.

 **Constraints:** 
1 <= |tag_name| <= 103

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-21T14:43:30.496Z  

```py
# Function to join given bound_by and tag
def join_middle(bound_by, tag_name):
  # complete the statement below to return the string as required
  n=len(bound_by)//2
  return bound_by[0 : n   ] + tag_name + bound_by[n:  ]
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/slicing-in-string-python/1)