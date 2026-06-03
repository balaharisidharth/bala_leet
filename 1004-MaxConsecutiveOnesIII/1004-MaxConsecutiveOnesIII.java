// Last updated: 03/06/2026, 14:21:42
1class Solution {
2    public int search(int[] nums, int target) {
3        int s = 0, e = nums.length - 1;
4        
5        while (s <= e) {
6            int m = (s + e) / 2;
7            
8            if (nums[m] == target) return m;
9            
10            // Check if left half is sorted
11            if (nums[s] <= nums[m]) {
12                if (target >= nums[s] && target < nums[m]) {
13                    e = m - 1;
14                } else {
15                    s = m + 1;
16                }
17            } 
18            // Otherwise right half is sorted
19            else {
20                if (target > nums[m] && target <= nums[e]) {
21                    s = m + 1;
22                } else {
23                    e = m - 1;
24                }
25            }
26        }
27        
28        return -1;
29    }
30}
31