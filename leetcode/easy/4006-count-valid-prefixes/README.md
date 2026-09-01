# Count Valid Prefixes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a binary string `s`.

A prefix of `s` is considered  **valid**  if its characters can be rearranged to form an  **alternating**  string.

Return the number of valid prefixes of `s`.

A string is considered  **alternating**  if no two adjacent characters are equal.

 

 **Example 1:** 

 **Input:**  s = "00101"

 **Output:**  3

 **Explanation:** 

The valid prefixes are:

- "0": It is already an alternating string.
- "001": It can be rearranged into "010", which is an alternating string.
- "00101": It can be rearranged into "01010", which is an alternating string.

Thus, the answer is 3.

 **Example 2:** 

 **Input:**  s = "101"

 **Output:**  3

 **Explanation:** 

All prefixes of `s = "101"` are already alternating strings. Thus, the answer is 3.

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists only of '0' and '1'.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 43.4 MB (beats 99.62%)  
**Submitted:** 2026-09-01T14:39:41.108Z  

```java
class Solution {
    public int countValidPrefixes(String s) {
        int count0=0;
        int count1=0;
        int ans=0;
        for (int i=0;i< s.length();i++){
            if (s.charAt(i) == '0') {
                count0++;
            }
            else{
                count1++;
            }
            if(Math.abs(count0 - count1)<=1){
            ans++;
        }
    } 
    return ans; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-valid-prefixes/)