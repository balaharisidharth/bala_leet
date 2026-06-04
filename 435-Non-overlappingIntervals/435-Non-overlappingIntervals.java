// Last updated: 04/06/2026, 12:15:21
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3               Arrays.sort(intervals,(a,b)->a[1]-b[1]);
4               int ans=0;
5               int n=intervals.length;
6               int end=Integer.MIN_VALUE;
7               for(int[]i:intervals){
8                if(end>i[0]){
9                    ans++;
10                }
11                else{
12                    end=i[1];
13                }
14               }
15               return ans;
16    }
17}