// Last updated: 13/06/2026, 14:57:44
1class Solution {
2    public int numIslands(char[][] grid) {
3         int c=0;
4         int row=grid.length;
5         int col=grid[0].length;
6         for(int i=0;i<row;i++){
7            for(int j=0;j<col;j++){
8                if(grid[i][j]=='1'){
9
10                c++;
11                travel(grid,i,j);
12                }
13            }
14         }
15         return c;
16    }
17    void travel(char[][] grid,int row,int col){
18        if(col>=grid[0].length || col<0 || row<0 || row>=grid.length || grid[row][col]=='0'){
19            return;
20        }
21        grid[row][col]='0';
22        travel(grid,row+1,col);
23        travel(grid,row,col-1);
24        travel(grid,row-1,col);
25        travel(grid,row,col+1);
26    }
27}