// Last updated: 03/08/2026, 09:11:41
1class Solution {
2    public String stoneGameIII(int[] stoneValue) {
3        int n = stoneValue.length;
4        int[] dp = new int[n + 1];
5
6        // dp[i] = maximum score difference current player can achieve
7        dp[n] = 0;
8
9        for (int i = n - 1; i >= 0; i--) {
10            dp[i] = Integer.MIN_VALUE;
11            int sum = 0;
12
13            for (int k = 0; k < 3 && i + k < n; k++) {
14                sum += stoneValue[i + k];
15                dp[i] = Math.max(dp[i], sum - dp[i + k + 1]);
16            }
17        }
18
19        if (dp[0] > 0)
20            return "Alice";
21        else if (dp[0] < 0)
22            return "Bob";
23        else
24            return "Tie";
25    }
26}