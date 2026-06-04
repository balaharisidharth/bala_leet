// Last updated: 04/06/2026, 15:05:03
1/**
2 * Question   : Climbing Stairs
3 * Complexity : Time: O(2^n) ; Space: O(n)
4 */
5class Solution {
6    public int climbStairs(int n) {
7        if(n<=2){
8            return n;
9        }
10        int n1=1;
11        int n2=2;
12        for(int i=3;i<=n;i++){
13            int temp=n1+n2;
14            n1=n2;
15            n2=temp;
16        }
17        return n2;
18    }
19}