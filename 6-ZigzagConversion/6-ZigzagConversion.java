// Last updated: 03/08/2026, 09:23:36
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m=obstacleGrid.length;
4        int n=obstacleGrid[0].length;
5        int[][] dp=new int[m][n];
6        if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1){
7            return 0;
8        }
9        dp[0][0]=1;
10        for(int i=1;i<m;i++){
11            if(obstacleGrid[i][0]==0){
12                dp[i][0]=dp[i-1][0];
13            }
14        }
15        for(int j=1;j<n;j++){
16            if(obstacleGrid[0][j]==0){
17                dp[0][j]=dp[0][j-1];
18            }
19        }
20        for(int i=1;i<m;i++){
21            for(int j=1;j<n;j++){
22                if(obstacleGrid[i][j]==1){
23                    dp[i][j]=0;
24                }
25                else{
26                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
27                }
28            }
29        }
30        return dp[m-1][n-1];
31    }
32}