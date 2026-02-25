// Last updated: 25/02/2026, 10:31:21
class Solution {
    public int arraySign(int[] nums) {
        int count=0,x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count++;
            }
            else if(nums[i]==0){
                x++;
            }
        }
        if(x>0){
            return 0;
        }
        else if(count%2==0){
            return 1;
        }
        else return -1;
    }
}