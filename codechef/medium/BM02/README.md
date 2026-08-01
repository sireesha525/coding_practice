# BM02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Subtraction and division of numbers

While sum and product of $2$ numbers did not require any specific precautions, we need to be careful during subtraction and division operations

- Subtraction can return a positive or negative value depending on which number is larger
- Division can return an integer or float

To divide two numbers and get an integer output, we use  **//**.

```
a = 10 // 5
print(a)

# Output
# 2

```

### Task

Write a program that does the following

- Accepts the number of inputs / test cases as 't' The only line of each test case contains 2 integers - declare them as variables $a$ and $b$
- For each test case, you need to perform the following operations Create a variable - $diff$ - what you get after subtracting $b$ from $a$. Create a variable - $division$ - the quotient when $a$ is divided by $b$ Output 2 space separated integers - $diff$ and $division$ in a single line

 **Note:**  The inputs have been created such that

- $a$ is necessarily greater than or equal to $b$
- $a$ is necessarily exactly divisible by $b$
### Sample 1:
Input
Output

```
2
10 5
16 4
```

```
5 2
12 4
```

### Explanation:

 **Test case 1** : The 2 integers are $10$ and $5$ and we output $5$ as their difference and $2$ as the quotient of their division

 **Test case 2** : The 2 integers are $16$ and $4$ - we output $12$ as their difference and $4$ as the quotient of their division

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-01T10:26:58.795Z  

```py
t = int(input())
for i in range(t):
    a, b = map(int,input().split())     
    diff = a-b
    division =a//b 
    
    print(diff, division)

```

---

[View on CodeChef](https://www.codechef.com/problems/BM02)