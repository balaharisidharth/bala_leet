// Last updated: 27/07/2026, 09:14:12
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s>9*n)return -1;
4        StringBuilder ans = new StringBuilder();
5        for(int i=0;i<n;i++){
6            int digit=Math.min(9,s);
7            ans.append(digit);
8            s-=digit;
9        }
10        return Integer.parseInt(ans.toString());
11    }
12}