# Max Sum of a Pair With Equal Sum of Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a  **0-indexed**  array `nums` consisting of  **positive**  integers. You can choose two indices `i` and `j`, such that `i != j`, and the sum of digits of the number `nums[i]` is equal to that of `nums[j]`.

Return the  **maximum**  value of `nums[i] + nums[j]` that you can obtain over all possible indices `i` and `j` that satisfy the conditions. If no such pair of indices exists, return -1.

 

 **Example 1:** 

```
Input: nums = [18,43,36,13,7]
Output: 54
Explanation: The pairs (i, j) that satisfy the conditions are:
- (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
- (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
So the maximum sum that we can obtain is 54.

```

 **Example 2:** 

```
Input: nums = [10,12,19,14]
Output: -1
Explanation: There are no two numbers that satisfy the conditions, so we return -1.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 109

## Solution

**Language:** Python  
**Runtime:** 280 ms (beats 69.92%)  
**Memory:** 33.5 MB (beats 37.40%)  
**Submitted:** 2026-08-13T06:07:49.340Z  

```py
class Solution:
    def maximumSum(self, nums: List[int]) -> int:
        digit_sum_map={}
        max_pair_sum=-1
        for num in nums:
            d_sum=0
            temp=num
            while temp>0:
                d_sum+=temp%10
                temp//=10
            if d_sum in digit_sum_map:
                pair=num+digit_sum_map.get(d_sum)
                max_pair_sum=max(max_pair_sum,pair)
                digit_sum_map[d_sum]=max(digit_sum_map.get(d_sum),num)
            else:
                digit_sum_map[d_sum]=num
        return max_pair_sum
```

---

[View on LeetCode](https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/)