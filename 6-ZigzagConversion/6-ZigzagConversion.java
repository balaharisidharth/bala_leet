// Last updated: 03/08/2026, 09:21:06
1class Solution {
2
3    private int solve(int i, int j, int m, int n, int[][] dp) {
4
5        if (i >= m || j >= n) {
6            return 0;
7        }
8
9        if (i == m - 1 || j == n - 1) {
10            return 1;
11        }
12
13        if (dp[i][j] != -1) {
14            return dp[i][j];
15        }
16
17        int right = solve(i, j + 1, m, n, dp);
18        int down = solve(i + 1, j, m, n, dp);
19
20        return dp[i][j] = right + down;
21    }
22
23    public int uniquePaths(int m, int n) {
24
25        if (m == 1 && n == 1) {
26            return 1;
27        }
28
29        int[][] dp = new int[m][n];
30
31        for (int[] row : dp) {
32            Arrays.fill(row, -1);
33        }
34
35        int right = solve(0, 1, m, n, dp);
36        int down = solve(1, 0, m, n, dp);
37
38        return right + down;
39    }
40}