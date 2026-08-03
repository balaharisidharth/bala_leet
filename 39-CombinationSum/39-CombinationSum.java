// Last updated: 03/08/2026, 09:03:56
1class Solution {
2    int count = 0;
3    public int totalNQueens(int n) {
4       
5        char[][] board = new char[n][n];
6
7        for(int i = 0; i < n; i++){
8            for(int j = 0; j < n; j++){
9                board[i][j] = '.';
10            }
11        }
12        nqueen(board, 0, n);
13        return count;
14    }
15    private void nqueen(char[][] board, int row, int n){
16
17        // Base case
18        if(row == n){
19            count++;
20            return;
21        }
22        for(int col = 0; col < n; col++){
23            if(isSafe(board,row,col,n)){
24                board[row][col] = 'Q';
25
26                nqueen(board, row+1, n);
27
28                board[row][col] = '.';
29            }
30        }
31    }
32    private boolean isSafe(char[][] board, int row ,int col, int n){
33        int i,j;
34        // chech column
35        for( i = 0; i < n; i++){
36           if(board[i][col] == 'Q') return false;
37        }
38        // check /
39         i = row;
40         j = col;
41        while(i >= 0 && j < n){
42            if(board[i][j] == 'Q') return false;
43            i--;
44            j++;
45        }
46        // check \
47        i = row;
48        j = col;
49        while(i >= 0 && j >= 0){
50            if(board[i][j] == 'Q') return false;
51            i--;
52            j--; 
53    }
54    return true;
55    }
56}