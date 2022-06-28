# Is Subsequence

https://leetcode.com/problems/is-subsequence/

## Solutions

1. My first approach would be using two pointers.
2. My second approach is dynamic programming solution.
3. Divide and Conquer (Greedy) is another approach I could not think of. It uses tail recursion and is interesting solution.

## Test cases

1. s.length is 0 => true
2. t.length is 0 => false
3. s.length == t.length == 0 => true
4. s is subsequence of t => true
5. s is not subsequence of t => false
6. s.length() > t.length() => false