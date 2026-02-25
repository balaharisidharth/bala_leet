// Last updated: 25/02/2026, 10:31:26
class Solution {
    public int countOdds(int low, int high) {
        if (low%2==1 && high %2==1) return ((high-low)/2)+1;
        else return ((high+1)-low)/2;
    }
}