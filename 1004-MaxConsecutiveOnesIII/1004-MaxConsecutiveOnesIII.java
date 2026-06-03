// Last updated: 03/06/2026, 16:17:14
1class Solution {
2    public int calculate(int[] piles,int mid){
3        int c=0;
4        for(int a : piles){
5            c+=(a/mid);
6            if(a%mid != 0){
7                c++;
8            }
9        }
10        return c;
11    }
12    public int minEatingSpeed(int[] piles, int h) {
13        int max=1;
14        int sum=0;
15        int l=piles.length;
16        int right=1;
17        for(int ele : piles){
18            sum+=ele;
19            if(max<=ele){
20                max=ele;
21            }
22        }
23        int left = max;
24        if(l==h){
25            return max;
26        }
27        // else if(sum==h){
28        //     return 1;
29        // }
30        else{
31            while( right < left){
32            int mid=(right+left)/2;
33            int hrs=calculate(piles,mid);
34            if(hrs>h){
35                right=mid+1;
36            }
37            else{
38                left=mid;
39            }
40            }
41        }
42        return left;
43    }
44}