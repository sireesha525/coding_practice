# LCPPCL68

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T09:22:33.820Z  

```c_cpp
#include <bits/stdc++.h>
using namespace std;

int main() {

    int Age;
    cin >> Age;
    int Vage = 18;
    if (Age < Vage) {//Insert {} before and after cout command
        cout << "Not old enough to vote." << endl;
        cout << "Wait for " << (Vage - Age) << " years"<<endl;
    }
    else
        cout << "Old enough to vote!";

}
```

---

[View on CodeChef](https://www.codechef.com/problems/LCPPCL68)