// Last updated: 15/06/2026, 11:59:29
1class Solution {
2    public int closedIsland(int[][] grid) {
3        int c = 0;
4        int row = grid.length;
5        int col = grid[0].length;
6        for (int i = 0; i < grid[0].length; i++) {
7            if (grid[0][i] == 0) {
8                travel1(grid, 0, i);
9            }
10            if (grid[row - 1][i] == 0) {
11                travel1(grid, row - 1, i);
12            }
13        }
14        for (int i = 0; i < grid.length; i++) {
15            if (grid[i][0] == 0) {
16                travel1(grid, i, 0);
17            }
18            if (grid[i][col - 1] == 0) {
19                travel1(grid, i, col - 1);
20            }
21        }
22
23        for (int i = 0; i < row; i++) {
24            for (int j = 0; j < col; j++) {
25                if (grid[i][j] == 0) {
26                    c++;
27                    travel(grid, i, j);
28                }
29            }
30
31        }
32
33        return c;
34    }
35
36    void travel(int[][] grid, int row, int col) {
37        if (col >= grid[0].length - 1 || col <= 0 || row <= 0 || row >= grid.length - 1 || grid[row][col] == 1) {
38            return;
39        }
40        grid[row][col] = 1;
41        travel(grid, row + 1, col);
42        travel(grid, row, col - 1);
43        travel(grid, row - 1, col);
44        travel(grid, row, col + 1);
45    }
46
47    void travel1(int[][] grid, int row, int col) {
48        if (col >= grid[0].length || col < 0 || row < 0 || row >= grid.length || grid[row][col] == 1) {
49            return;
50        }
51        grid[row][col] = 1;
52        travel1(grid, row + 1, col);
53        travel1(grid, row, col - 1);
54        travel1(grid, row - 1, col);
55        travel1(grid, row, col + 1);
56    }
57}