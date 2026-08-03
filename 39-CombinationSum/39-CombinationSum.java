// Last updated: 03/08/2026, 08:57:25
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Arrays.sort(nums);
4        int count=1;
5        for(int i=0;i<nums.length;i++){
6         if(count==nums[i]) count++;
7         else if(nums[i]>count) return count;
8        }
9        return count;
10    }
11}