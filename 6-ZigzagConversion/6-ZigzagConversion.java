// Last updated: 03/08/2026, 09:20:24
1class Solution {
2    public int[][] generateMatrix(int n) {
3        // Result matrix
4        int[][] spiralMatrix = new int[n][n];
5
6        // Directions: right, down, left, up
7        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
8
9        // Current direction index
10        int index = 0;
11
12        // Number to be filled in the matrix
13        int num = 1;
14
15        // Boundaries of the current spiral layer
16        int maxRows = n - 1;
17        int minRows = 0;
18        int maxCols = n - 1;
19        int minCols = 0;
20
21        // Start from top-left corner
22        for (int row = 0, col = 0;
23             row >= minRows && col >= minCols && row <= maxRows && col <= maxCols; ) {
24
25            // Fill current cell
26            spiralMatrix[row][col] = num++;
27
28            // If moving right and reached right boundary,
29            // turn down and shrink top boundary
30            if (index == 0 && col == maxCols) {
31                index++;
32                minRows++;
33            }
34
35            // If moving down and reached bottom boundary,
36            // turn left and shrink right boundary
37            if (index == 1 && row == maxRows) {
38                index++;
39                maxCols--;
40            }
41
42            // If moving left and reached left boundary,
43            // turn up and shrink bottom boundary
44            if (index == 2 && col == minCols) {
45                index++;
46                maxRows--;
47            }
48
49            // If moving up and reached top boundary,
50            // turn right and shrink left boundary
51            if (index == 3 && row == minRows) {
52                index = 0;
53                minCols++;
54            }
55
56            // Move to next cell based on current direction
57            row += directions[index][0];
58            col += directions[index][1];
59        }
60
61        return spiralMatrix;
62    }
63}