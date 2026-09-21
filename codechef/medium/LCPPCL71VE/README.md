# LCPPCL71VE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Conditional Statements (else-if)

Learn about how to use conditional else-if from this short video explanation

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T09:24:07.622Z  

```c_cpp
#include <bits/stdc++.h>
using namespace std;

int main() {

    int age;
    cin >> age;
    int voting_age = 18;
    
    if (age >= voting_age) {
        cout << "Old enough to vote!";
    } else {
        cout << "Not old enough to vote.";
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCPPCL71VE)