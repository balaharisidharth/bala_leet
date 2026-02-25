// Last updated: 25/02/2026, 10:31:02
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int rem = time%(n-1);
        if (cycle%2==1){
            return n-rem;
        }
        else return rem+1;
        
    }
}