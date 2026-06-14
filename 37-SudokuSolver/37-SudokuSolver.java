// Last updated: 15/06/2026, 02:02:42
1class Solution {
2    public void solveSudoku(char[][] board) {
3        backtrack(board);
4    }
5
6    private boolean backtrack(char[][] board) {
7        for (int row = 0; row < 9; row++) {
8            for (int col = 0; col < 9; col++) {
9                if (board[row][col] == '.') { // empty cell
10                    for (char num = '1'; num <= '9'; num++) {
11                        if (isValid(board, row, col, num)) {
12                            board[row][col] = num; // place number
13                            if (backtrack(board)) return true; // recurse
14                            board[row][col] = '.'; // undo (backtrack)
15                        }
16                    }
17                    return false; // no valid number found
18                }
19            }
20        }
21        return true; // all cells filled
22    }
23
24    private boolean isValid(char[][] board, int row, int col, char num) {
25        for (int i = 0; i < 9; i++) {
26            // check row and column
27            if (board[row][i] == num || board[i][col] == num) return false;
28            // check 3x3 box
29            int boxRow = (row / 3) * 3 + i / 3;
30            int boxCol = (col / 3) * 3 + i % 3;
31            if (board[boxRow][boxCol] == num) return false;
32        }
33        return true;
34    }
35}
36