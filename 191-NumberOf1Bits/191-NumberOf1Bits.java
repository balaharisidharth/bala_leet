// Last updated: 25/02/2026, 10:32:06
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n !=0){
            if((n & 1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
}