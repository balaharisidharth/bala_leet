// Last updated: 03/08/2026, 09:09:02
1class Solution { 
2    public int removeDuplicates(int[] nums) { 
3        int i = 0; 
4        for (int num : nums) { 
5            if (i < 2 || num != nums[i - 2]) { 
6            nums[i++] = num; 
7            } 
8        }
9
10        return i; 
11    } 
12}