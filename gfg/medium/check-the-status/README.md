# check-the-status

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-16T14:08:26.556Z  

```py
class Solution:
    def checkStatus(self, a, b, flag):
        if(a>0 and b<0 and flag==False):
          return True
        elif(a<0 and b>0 and flag==False):
            return True
        elif(a<0 and b<0 and flag==True):
            return True
        else:
            return False
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-the-status/1)