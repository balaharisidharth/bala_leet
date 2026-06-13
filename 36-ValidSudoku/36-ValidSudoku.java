// Last updated: 13/06/2026, 08:52:05
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        for (int i = 0; i < 9; i++) {
4            boolean[] seen = new boolean[9];
5            for (int j = 0; j < 9; j++) {
6                if (board[i][j] == '.') continue;
7                int num = board[i][j] - '1'; 
8                if (seen[num]) return false; 
9                seen[num] = true;
10            }
11        }
12
13        for (int j = 0; j < 9; j++) {
14            boolean[] seen = new boolean[9];
15            for (int i = 0; i < 9; i++) {
16                if (board[i][j] == '.') continue;
17                int num = board[i][j] - '1';
18                if (seen[num]) return false;
19                seen[num] = true;
20            }
21        }
22
23        for (int boxRow = 0; boxRow < 3; boxRow++) {
24            for (int boxCol = 0; boxCol < 3; boxCol++) {
25                boolean[] seen = new boolean[9];
26                for (int i = 0; i < 3; i++) {
27                    for (int j = 0; j < 3; j++) {
28                        int row = boxRow * 3 + i;
29                        int col = boxCol * 3 + j;
30                        if (board[row][col] == '.') continue;
31                        int num = board[row][col] - '1';
32                        if (seen[num]) return false;
33                        seen[num] = true;
34                    }
35                }
36            }
37        }
38
39        return true;
40    }
41}
42