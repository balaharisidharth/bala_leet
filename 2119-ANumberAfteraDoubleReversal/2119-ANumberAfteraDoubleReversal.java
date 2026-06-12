// Last updated: 13/06/2026, 00:57:31
1class Solution {
2    public boolean isSameAfterReversals(int num) {
3        int rev=0;
4        int temp=num;
5        while(num!=0){
6            rev=(rev*10)+(num%10);
7            num/=10;
8        }
9        while(rev!=0){
10            num=(num*10)+(rev%10);
11            rev/=10;
12        }
13        return num==temp;
14    }
15}