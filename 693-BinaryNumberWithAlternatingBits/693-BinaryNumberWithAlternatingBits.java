// Last updated: 25/02/2026, 10:31:41
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=(n^(n>>1));
        return (x&(x+1))==0?true:false;
    }
}