// Last updated: 03/08/2026, 09:01:33
1public class Solution {
2    public void rotate(int[][] matrix) {
3        for(int i = 0; i<matrix.length; i++){
4            for(int j = i; j<matrix[0].length; j++){
5                int temp = 0;
6                temp = matrix[i][j];
7                matrix[i][j] = matrix[j][i];
8                matrix[j][i] = temp;
9            }
10        }
11        for(int i =0 ; i<matrix.length; i++){
12            for(int j = 0; j<matrix.length/2; j++){
13                int temp = 0;
14                temp = matrix[i][j];
15                matrix[i][j] = matrix[i][matrix.length-1-j];
16                matrix[i][matrix.length-1-j] = temp;
17            }
18        }
19    }
20}