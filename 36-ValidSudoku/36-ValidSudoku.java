// Last updated: 13/06/2026, 00:27:46
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        // Check each row
4        for (int i = 0; i < 9; i++) {
5            boolean[] seen = new boolean[9];
6            for (int j = 0; j < 9; j++) {
7                if (board[i][j] == '.') continue;
8                int num = board[i][j] - '1'; // convert '1'-'9' to 0-8
9                if (seen[num]) return false; // duplicate found
10                seen[num] = true;
11            }
12        }
13
14        // Check each column
15        for (int j = 0; j < 9; j++) {
16            boolean[] seen = new boolean[9];
17            for (int i = 0; i < 9; i++) {
18                if (board[i][j] == '.') continue;
19                int num = board[i][j] - '1';
20                if (seen[num]) return false;
21                seen[num] = true;
22            }
23        }
24
25        // Check each 3x3 box
26        for (int boxRow = 0; boxRow < 3; boxRow++) {
27            for (int boxCol = 0; boxCol < 3; boxCol++) {
28                boolean[] seen = new boolean[9];
29                for (int i = 0; i < 3; i++) {
30                    for (int j = 0; j < 3; j++) {
31                        int row = boxRow * 3 + i;
32                        int col = boxCol * 3 + j;
33                        if (board[row][col] == '.') continue;
34                        int num = board[row][col] - '1';
35                        if (seen[num]) return false;
36                        seen[num] = true;
37                    }
38                }
39            }
40        }
41
42        return true; // no duplicates found
43    }
44}
45