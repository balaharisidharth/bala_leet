// Last updated: 01/06/2026, 06:41:10
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        int j=1;
5        for(int i=1;i<n;i++){
6            if(nums[i]!=nums[i-1]){
7                nums[j]=nums[i];
8                j++;
9            }
10        }
11        return j;
12        
13    }
14}