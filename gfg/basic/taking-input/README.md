# Taking Input

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You need to perform three separate tasks based on the given input:

- String Input and Print: Read a string s (which may contain spaces) and print it as it is.
- Integer Input and Print: Read an integer n and print it without any change.
- Float Input and floor Print: Read a floating-point number as input, take its floor value, and print as an integer.

 **Examples:** 

```
Input: s = "Hello", n = 20, f = 5.5
Output: 
Hello
20
5
Explanation: 
The string Hello is printed as it is.
The integer 20 is printed without any change.
For floating-point number 5.5, its floor value 5 is printed.

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T23:50:28.293Z  

```cpp
#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main() {
    string s;
    int n;
    float f;
    int ff;

    getline(cin, s);
    cin >> n;
    cin >> f;

    ff = floor(f);

    cout << s << endl;
    cout << n << endl;
    cout << ff << endl;

    return 0;
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/taking-input/1)