// Last updated: 03/06/2026, 16:10:00
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
12
13
14
15    public int minEatingSpeed(int[] piles, int h) {
16        int max=1;
17        int sum=0;
18        int l=piles.length;
19        int right=1;
20        for(int ele : piles){
21            sum+=ele;
22            if(max<=ele){
23                max=ele;
24            }
25        }
26        int left = max;
27        if(l==h){
28            return max;
29        }
30        else if(sum==h){
31            return 1;
32        }
33        else{
34            while( right < left){
35            int mid=(right+left)/2;
36            int hrs=calculate(piles,mid);
37            if(hrs>h){
38                right=mid+1;
39            }
40            else{
41                left=mid;
42            }
43            }
44
45
46        }
47        return left;
48    }
49}