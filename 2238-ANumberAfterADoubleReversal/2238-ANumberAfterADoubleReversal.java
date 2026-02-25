// Last updated: 25/02/2026, 10:31:14
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        if(num%10==0){
            return false;
        }
        return true;
    }
}