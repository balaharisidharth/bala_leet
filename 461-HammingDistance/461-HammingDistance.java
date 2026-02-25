// Last updated: 25/02/2026, 10:31:47
class Solution {
    public int hammingDistance(int x, int y) {
        int ham= x^y;
        return Integer.bitCount(ham);
    }
}