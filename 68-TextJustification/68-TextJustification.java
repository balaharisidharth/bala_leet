// Last updated: 27/07/2026, 09:02:43
1public class Solution {
2public int maximalRectangle(char[][] matrix) {
3    if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
4    
5    int[] height = new int[matrix[0].length];
6    for(int i = 0; i < matrix[0].length; i ++){
7        if(matrix[0][i] == '1') height[i] = 1;
8    }
9    int result = largestInLine(height);
10    for(int i = 1; i < matrix.length; i ++){
11        resetHeight(matrix, height, i);
12        result = Math.max(result, largestInLine(height));
13    }
14    
15    return result;
16}
17
18private void resetHeight(char[][] matrix, int[] height, int idx){
19    for(int i = 0; i < matrix[0].length; i ++){
20        if(matrix[idx][i] == '1') height[i] += 1;
21        else height[i] = 0;
22    }
23}    
24
25public int largestInLine(int[] height) {
26    if(height == null || height.length == 0) return 0;
27    int len = height.length;
28    Stack<Integer> s = new Stack<Integer>();
29    int maxArea = 0;
30    for(int i = 0; i <= len; i++){
31        int h = (i == len ? 0 : height[i]);
32        if(s.isEmpty() || h >= height[s.peek()]){
33            s.push(i);
34        }else{
35            int tp = s.pop();
36            maxArea = Math.max(maxArea, height[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
37            i--;
38        }
39    }
40    return maxArea;
41}
42}