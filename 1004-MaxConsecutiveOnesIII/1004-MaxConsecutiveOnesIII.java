// Last updated: 03/06/2026, 14:22:32
1class Solution {
2    public int search(int[] nums, int target) {
3        int s = 0, e = nums.length - 1;
4        
5        while (s <= e) {
6            int m = (s + e) / 2;
7            
8            if (nums[m] == target) return m;
9                if (nums[s] <= nums[m]) {
10                if (target >= nums[s] && target < nums[m]) {
11                    e = m - 1;
12                } else {
13                    s = m + 1;
14                }
15            } 
16            else {
17                if (target > nums[m] && target <= nums[e]) {
18                    s = m + 1;
19                } else {
20                    e = m - 1;
21                }
22            }
23        }
24        
25        return -1;
26    }
27}
28