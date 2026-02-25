// Last updated: 25/02/2026, 10:31:31
class Solution {
    public int tribonacci(int n) {
        if (n==0 || n==1) return n;
        if ( n==2) return 1;
        int b1=0,b2=1,b3=1,tri=0;
        for (int i=2;i<n;i++){
            tri=b1+b2+b3;
            b1=b2;
            b2=b3;
            b3=tri;
        }
        return tri;
    }
}