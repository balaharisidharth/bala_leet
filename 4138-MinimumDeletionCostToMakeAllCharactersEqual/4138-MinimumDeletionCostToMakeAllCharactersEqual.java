// Last updated: 25/02/2026, 10:30:45
class Solution {
    public long minCost(String s, int[] cost) {
        int n = s.length();
        long totalSum = 0;
        
        for (int c : cost) {
            totalSum += c;
        }
        
        // Step 2: Map each character to its total cost
        Map<Character, Long> charCostMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            charCostMap.put(ch, charCostMap.getOrDefault(ch, 0L) + cost[i]);
        }
        
        // Step 3: Find minimum deletion cost
        long minCost = Long.MAX_VALUE;
        for (long keepCost : charCostMap.values()) {
            minCost = Math.min(minCost, totalSum - keepCost);
        }
        
        return minCost;


    }
}