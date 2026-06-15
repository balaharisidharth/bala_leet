// Last updated: 15/06/2026, 10:47:13
1class Solution {
2    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
3        if (grid == null || grid.length == 0) {
4            return null;
5        }
6        int old = grid[row][col];
7        boolean[][] visit=new boolean[grid.length][grid[0].length];
8        travel(grid, row, col, old,visit); 
9        for (int i = 0; i < grid.length; i++) {
10            for (int j = 0; j < grid[0].length; j++) {
11                if (grid[i][j] < 0) {
12                    grid[i][j] = color; 
13                } 
14                // else if (grid[i][j] == 0) {
15                //     grid[i][j] = old;  
16                // }
17            }
18        }
19        return grid;  
20    }
21
22    void travel(int[][] grid, int i, int j, int old,boolean visit[][]) {
23        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != old || visit[i][j]==true) {
24            return;
25        }
26        visit[i][j]=true;
27        grid[i][j] = -old; 
28        travel(grid, i, j + 1, old,visit);
29        travel(grid, i, j - 1, old,visit);
30        travel(grid, i + 1, j, old,visit);
31        travel(grid, i - 1, j, old,visit);
32
33        if (i > 0 && j > 0 && i < grid.length - 1 && j < grid[0].length - 1
34            && old == Math.abs(grid[i + 1][j]) 
35            && old == Math.abs(grid[i - 1][j]) 
36            && old == Math.abs(grid[i][j + 1]) 
37            && old == Math.abs(grid[i][j - 1])) {
38            grid[i][j] = old;
39        }
40    }
41}
42