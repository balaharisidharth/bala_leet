// Last updated: 15/06/2026, 02:01:05
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> res = new ArrayList<>();
4        char[][] board = new char[n][n];
5        for (int i = 0; i < n; i++) Arrays.fill(board[i], '.');
6        backtrack(res, board, 0);
7        return res;
8    }
9
10    private void backtrack(List<List<String>> res, char[][] board, int row) {
11        int n = board.length;
12        if (row == n) {
13            List<String> temp = new ArrayList<>();
14            for (char[] r : board) temp.add(new String(r));
15            res.add(temp);
16            return;
17        }
18        for (int col = 0; col < n; col++) {
19            boolean safe = true;
20            for (int i = 0; i < row; i++) if (board[i][col] == 'Q') safe = false;
21            for (int i=row-1,j=col-1; i>=0&&j>=0; i--,j--) if (board[i][j]=='Q') safe = false;
22            for (int i=row-1,j=col+1; i>=0&&j<n; i--,j++) if (board[i][j]=='Q') safe = false;
23            if (!safe) continue;
24            board[row][col] = 'Q';
25            backtrack(res, board, row+1);
26            board[row][col] = '.';
27        }
28    }
29}
30