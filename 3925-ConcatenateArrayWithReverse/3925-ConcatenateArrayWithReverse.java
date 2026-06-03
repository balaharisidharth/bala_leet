// Last updated: 03/06/2026, 13:23:36
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int s=0;
4        int row=matrix.length;
5        int col=matrix[0].length;
6        int e=row*col-1;
7        while(s<=e){
8            int mid=(e+s)/2;
9            int val=matrix[mid/col][mid%col];
10            if(val==target) return true;
11            if(val>target){
12                e=mid-1;}
13                else{
14                    s=mid+1;
15                }
16            
17        }
18        return false;
19    }
20}