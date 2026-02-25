// Last updated: 25/02/2026, 10:32:23
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }
}