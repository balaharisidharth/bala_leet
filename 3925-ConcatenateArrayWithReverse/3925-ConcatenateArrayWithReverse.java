// Last updated: 03/06/2026, 12:01:13
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        while(left <= right)
5        {
6            int mid = left + (right - left) / 2;
7            if(nums[mid] == target)
8            {
9                return mid;
10            }
11            else if(nums[mid] < target)
12            {
13                left = mid + 1;
14            }
15            else
16            {
17                right = mid - 1;
18            }
19        }
20        return -1;
21    }
22}