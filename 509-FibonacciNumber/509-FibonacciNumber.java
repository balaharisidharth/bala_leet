// Last updated: 04/06/2026, 16:00:17
1class Solution {
2    public int tribonacci(int n) {
3        int n1=0;
4        int n2=1;
5        int n3=1;
6        if(n<=1){
7            return n;
8        }
9        else if(n==2){
10            return 1;
11        }
12        else {
13            for(int i=3;i<=n;i++){
14                int temp=n1+n2+n3;
15                n1=n2;
16                n2=n3;
17                n3=temp;
18            }
19            return n3;
20        }
21    }
22}