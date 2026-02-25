// Last updated: 25/02/2026, 10:31:05
class Solution {
    public int numberOfCuts(int n) {
        if(n>1){
            if(n%2==1){
            return n;
        }
        else return n/2;
        }  
        else return 0; 
    }
}