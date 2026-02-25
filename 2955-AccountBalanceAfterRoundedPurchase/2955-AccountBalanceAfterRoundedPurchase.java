// Last updated: 25/02/2026, 10:30:53
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int n = 0;
        if ((purchaseAmount%10)<5){
            return 100-((purchaseAmount/10))*10;
        }
        else return 100-((purchaseAmount/10)+1)*10;
    }
}