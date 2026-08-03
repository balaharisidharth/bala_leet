// Last updated: 03/08/2026, 08:55:23
1import java.util.*;
2
3class Solution {
4    public void nextPermutation(int[] nums) {
5        int n = nums.length, i = n - 2;
6        
7        // Step 1: Find the breakpoint
8        while (i >= 0 && nums[i] >= nums[i + 1]) {
9            i--;
10        }
11        
12        if (i >= 0) {
13            // Step 2: Find the smallest element larger than nums[i]
14            int j = n - 1;
15            while (nums[j] <= nums[i]) {
16                j--;
17            }
18            // Swap nums[i] and nums[j]
19            int temp = nums[i];
20            nums[i] = nums[j];
21            nums[j] = temp;
22        }
23        
24        // Step 3: Reverse the subarray to the right of i
25        reverse(nums, i + 1, n - 1);
26    }
27    
28    private void reverse(int[] nums, int start, int end) {
29        while (start < end) {
30            int temp = nums[start];
31            nums[start] = nums[end];
32            nums[end] = temp;
33            start++;
34            end--;
35        }
36    }
37}