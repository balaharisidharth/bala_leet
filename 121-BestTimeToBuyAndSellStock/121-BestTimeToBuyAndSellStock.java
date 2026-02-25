// Last updated: 25/02/2026, 10:32:12
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update minimum price so far
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if sold today
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
         return maxProfit;
    }
}


