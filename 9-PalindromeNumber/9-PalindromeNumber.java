// Last updated: 25/02/2026, 10:32:29
class Solution {
    public boolean isPalindrome(int x) {
        int cpy =x;
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return cpy == reversed;
    }
}