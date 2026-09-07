# Decision Making

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers,  **n**  and  **m**. The task is to check the relation between n and m. Print "less" if n < m,  "equal" if n == m, and "greater" if n > m.

**Examples :
**

```
Input: n = 4, m = 8
Output: less
Explanation: 4 < 8 so print 'less'.
```

```
Input: n = 8, m = 8
Output: equal
Explanation: 8 = 8 so print 'equal'.
```

```
Input: n = 8, m = 4
Output: greater
Explanation: 8 > 4 so print 'greater'.
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T23:57:37.701Z  

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    // code here 
    if(n < m){
        cout << "less";
    }
    else if(n == m){
        cout << "equal";
    }
    else{
        cout << "greater";
    }


    return 0;
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/decision-making/1)