// Last updated: 25/02/2026, 10:31:58
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1+(num-1 )%9;
    }
}