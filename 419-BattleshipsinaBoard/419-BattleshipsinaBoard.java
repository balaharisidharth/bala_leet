// Last updated: 15/06/2026, 14:53:50
1class Solution {
2    public int countBattleships(char[][] board) {
3         int c=0;
4         int row=board.length;
5         int col=board[0].length;
6         for(int i=0;i<row;i++){
7            for(int j=0;j<col;j++){
8                if(board[i][j]=='X'){
9                c++;
10                travel(board,i,j);
11                }
12            }
13         }
14         return c;
15    }
16    void travel(char[][] board,
17    int row,int col){
18        if(col>=board[0].length || col<0 || row<0 || row>=board.length || board[row][col]=='.'){
19            return;
20        }
21        board[row][col]='.';
22        travel(board,row+1,col);
23        travel(board,row-1,col);
24        travel(board,row,col-1);
25        travel(board,row,col+1);
26    }
27}