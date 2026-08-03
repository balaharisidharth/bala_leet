// Last updated: 03/08/2026, 09:24:46
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4        
5        for (int i = 1; i < m; i++) grid[i][0] += grid[i-1][0];
6        
7        for (int j = 1; j < n; j++) grid[0][j] += grid[0][j-1];
8        
9        for (int i = 1; i < m; i++)
10            for (int j = 1; j < n; j++)
11                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
12        
13        return grid[m-1][n-1];
14    }
15}