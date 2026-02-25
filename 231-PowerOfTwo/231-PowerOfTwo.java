// Last updated: 25/02/2026, 10:32:02
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n>0){
            if(n%2==0){
                n=n/2;
            }else break;
        }
        if (n==1) return true;
        else return false;
    }
}