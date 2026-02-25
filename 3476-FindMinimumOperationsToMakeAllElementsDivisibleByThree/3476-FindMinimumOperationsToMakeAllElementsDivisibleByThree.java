// Last updated: 25/02/2026, 10:30:50
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]%3)!=0){
                count++;
            }
        }
           return count;
    }
}