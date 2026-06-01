// Last updated: 01/06/2026, 06:41:42
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        
4        int c = 0;
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] != val){
7                nums[c] = nums[i];
8                c++;
9                
10            }
11            
12        }
13        
14        return c;
15    }
16    
17
18}