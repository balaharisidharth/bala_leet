// Last updated: 25/02/2026, 10:31:38
class Solution {
    public int fib(int n) {
        if (n==0 || n==1) return n;
        int b1=0;
        int b2=1;
        int fact=0;
        for(int i=1;i<n;i++){
            fact=b1+b2;
            b1=b2;
            b2=fact;
            
        }
        return fact;
    }
}