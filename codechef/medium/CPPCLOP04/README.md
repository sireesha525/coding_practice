# CPPCLOP04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple choice question

What would be the output of the code below?

```
int a = 10;
int b = 2;
a /= b;
cout<<a;

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T14:47:06.644Z  

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
  int length = 11;
  // Update your code below this line
  length %= 3;
  cout<<length;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CPPCLOP04)