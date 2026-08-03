// Last updated: 03/08/2026, 09:05:12
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();          // Stores the Output
4
5        int top = 0;                                    // Top row
6        int rightColumn = matrix[0].length - 1;     // Right Column
7        int bottom = matrix.length - 1;             // Bottom row
8        int leftColumn = 0;                         // Left Column
9
10        while (top <= bottom && rightColumn >= leftColumn) {
11            // Print Top
12            for (int i = leftColumn; i <= rightColumn ; i++) {
13                ans.add(matrix[top][i]);
14            }
15            top++;
16
17            // Print Right Column
18            for (int i = top; i <= bottom; i++) {
19                ans.add(matrix[i][rightColumn]);
20            }
21            rightColumn--;
22
23            // Print bottom
24            if(top <= bottom){
25                for (int i = rightColumn; i >= leftColumn; i--) {
26                    ans.add(matrix[bottom][i]);
27                }
28                bottom--;
29            }
30
31            // Print Left Column
32            if(leftColumn <= rightColumn){
33                for (int i = bottom; i >= top; i--) {
34                    ans.add(matrix[i][leftColumn]);
35                }
36                leftColumn++;
37            }
38            
39        }
40        return ans;
41    }
42}