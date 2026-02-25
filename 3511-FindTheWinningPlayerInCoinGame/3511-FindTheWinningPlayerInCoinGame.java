// Last updated: 25/02/2026, 10:30:48
class Solution {
    public String winningPlayer(int x, int y) {
        int turn =1;
        while(x>=1 && y>=4){
            x-=1;
            y-=4;
            turn++;
        }
        if (turn%2==0){
            return "Alice";
        }
        else {
            return "Bob";
        }
    }
}