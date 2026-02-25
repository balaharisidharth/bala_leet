// Last updated: 25/02/2026, 10:31:01
class Solution {
    public int distinctIntegers(int n) {
        int x=n;
        int count=1;
        while(x!=1){
            if(x%(x-1)!=1){
                break;
            }
            else{
                count++;
            }
            x=x-1;
        }
        return count;
    }
}