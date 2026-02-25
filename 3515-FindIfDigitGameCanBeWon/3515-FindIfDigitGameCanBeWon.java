// Last updated: 25/02/2026, 10:30:47
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle=0;
        int doublesum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sumSingle+=nums[i];
            }
            else{
                doublesum+=nums[i];
            }
        }
        if(sumSingle!=doublesum){
            return true;
        }
        else return false;
    }
}